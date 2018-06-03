pipeline {

    agent any

    tools {
        maven 'mvnLocal'
        jdk 'jdkLocal'
    }

    parameters {
         string(name: 'fuse_dev', defaultValue: 'localhost', description: 'Servidor de desarrollo en AWS para Multiva')
    }

    triggers {
         pollSCM('* * * * *')
     }

stages{
      stage('Clone'){
          steps {
              sh 'mvn clean package -DskipTests'
          }
          post {
              success {
                  echo 'Now Archiving...'
                  archiveArtifacts artifacts: '**/target/*.jar'
              }
          }
      }

      script {
        def app

        stage('Build image') {
            /* This builds the actual image; synonymous to
             * docker build on the command line */
            app = docker.build("multiva/esb-01-datos-basicos")
        }

        stage('Push image') {
            /* Finally, we'll push the image with two tags:
             * First, the incremental build number from Jenkins
             * Second, the 'latest' tag.
             * Pushing multiple tags is cheap, as all the layers are reused. */
            docker.withRegistry('https://registry.hub.docker.com', 'docker-hub-credentials') {
                app.push("${env.BUILD_NUMBER}")
                app.push("latest")
            }
        }
      }



    }
}

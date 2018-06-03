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

      stage('Build Container') {
         steps {
           sh "docker build -t ejemplo:${env.BUILD_ID} ."
          }
       }

      stage('Push Container') {
        steps {
            withCredentials([usernamePassword(credentialsId: 'docker-hub-credentials', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
              sh "docker login -u ${USERNAME} -p ${PASSWORD}"
              sh "docker push 130189/ejemplo:${env.BUILD_ID}"
              sh "docker push 130189/ejemplo:latest"
            }
         }
      }
    }
}

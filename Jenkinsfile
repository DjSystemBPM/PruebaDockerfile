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

      stage('Make Container') {
         steps {
           sh "docker build -t NOMBRE_DE_LA_INTERFAZ:${env.BUILD_ID} ."
           sh "docker tag snscaimito/ledger-service:${env.BUILD_ID} snscaimito/ledger-service:latest"
         }
       }
    }
}

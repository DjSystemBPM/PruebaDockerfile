pipeline {

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
              sh 'mvn clean package'
          }
          post {
              success {
                  echo 'Now Archiving...'
                  archiveArtifacts artifacts: '**/target/*.jar'
              }
          }
      }

    }
}

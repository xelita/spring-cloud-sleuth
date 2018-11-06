pipeline {
  agent any
  stages {
    stage('initialize') {
      agent {
        docker {
          image 'maven'
        }

      }
      steps {
        sh 'mvn clean'
      }
    }
  }
}
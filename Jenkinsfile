pipeline {
  agent any
  stages {
    stage('Information') {
      steps {
        sh 'printenv'
      }
    }

    stage('Prepare') {
      steps {
        echo 'This is Stage Prepare!'
        sh 'echo "Preparing.."'
      }
    }

    stage('Build') {
      steps {
        echo 'This is Stage Build'
        sh './gradlew build'
      }
    }

    stage('Test') {
      steps {
        echo 'This is Stage Test'
        sh './gradlew clean test'
      }
    }

    stage('Deploy') {
      steps {
        echo 'This is Stage Deploy'
        sh 'echo "Deploying..."'
      }
    }

  }
  post {
    always {
      script {
        def result = currentBuild.result
        if (result == null) {
          result = "SUCCESS"
        } else {
          result = "ERROR"
        }
      }

    }

    success {
      echo 'step will run only if the build is successful'
    }

    failure {
      echo 'only when the Pipeline is currently in a "failed" state run, usually expressed in the Web UI with the red indicator.'
    }

    unstable {
      echo 'current Pipeline has "unstable" state, usually by a failed test, code violations and other causes, in order to run. Usually represented in a web UI with a yellow indication.'
    }

    changed {
      echo "Status Changed: [From: $currentBuild.previousBuild.result, To: $currentBuild.result]"
    }

  }
}
pipeline {
    agent any


    stages {
        stage('Build') {
            steps {
                sh 'chmod +x gradlew' // Accorder les permissions d'exécution au script Gradle
                sh './gradlew assemble'
            }
        }
        stage('Test') {
            steps {
                sh './gradlew test'
            }
        }
        stage('Build The Docker image') {
             steps {
                 script{
                    sh 'docker build -t Book-API .'
                 }

             }
        }
    }
}
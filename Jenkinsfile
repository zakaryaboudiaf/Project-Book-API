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
                script {
                    def dockerTag = "Book-API:${env.BUILD_NUMBER}"
                    def containerId = sh(script: "docker run -d -t ${dockerTag}", returnStdout: true).trim()
                    sh "docker exec ${containerId} docker build -t ${dockerTag} ."
                }
             }
        }
    }
}
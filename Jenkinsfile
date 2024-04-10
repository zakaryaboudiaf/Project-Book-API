pipeline {
    agent {
        any
    }


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
                    sh "docker build -t ${dockerTag} ."
                }
             }
        }
    }
}
pipeline {
    agent {
    docker {
         image 'openjdk:11'
         args '-v /var/run/docker.sock:/var/run/docker.sock'
        }
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
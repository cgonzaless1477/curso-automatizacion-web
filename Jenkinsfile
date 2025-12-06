pipeline {
    agent any

    stages {
        stage('Build & Test') {
            steps {
                bat 'mvn -version'
                bat 'mvn clean test'
            }
        }
    }
}

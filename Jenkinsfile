pipeline {
    agent any

    stages {
        stage('Build & Test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }

    post {
        always {
            // Publicar resultados de tests
            junit 'target/surefire-reports/*.xml'

            // Publicar capturas como artefactos
            archiveArtifacts artifacts: 'target/screenshots/**/*.png',
                             fingerprint: true,
                             allowEmptyArchive: true
        }
    }
}

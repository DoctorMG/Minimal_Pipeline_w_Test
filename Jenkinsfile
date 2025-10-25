
pipeline {
    agent any

    tools {
        // Name muss exakt dem Eintrag in "Global Tool Configuration" entsprechen
        maven 'Maven_3_8_7'
    }

    stages {
        stage('Check Maven Version') {
            steps {
                // Prüfen, ob Maven korrekt installiert wurde
                bat 'mvn --version'
            }
        }

        stage('Build') {
            steps {
                // Beispiel: Projekt bauen
                bat 'mvn clean install'
            }
        }

        stage('Run') {
            steps {
                bat 'java -jar target/minimal-maven-1.0-SNAPSHOT.jar'
            }
        }
    }

    post {
        success {
            echo 'Build erfolgreich abgeschlossen!'
        }
        failure {
            echo 'Build fehlgeschlagen.'
        }
}

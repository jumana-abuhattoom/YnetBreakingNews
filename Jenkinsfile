
pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                    sh 'mvn package'
            }
        }
         stage('Run') {
            steps {
                 sh 'sudo nohup java -jar target/xmltohtml-0.0.1-SNAPSHOT.jar &'
            }
        }
    }
}
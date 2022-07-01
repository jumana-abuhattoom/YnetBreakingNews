
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
    
     post {

                success {
                        slackSend baseUrl: 'https://hooks.slack.com/services/', channel: '#jenkins', message: 'This build is succeed', teamDomain: 'fursa-co', tokenCredentialId: 'slack'}

            }
}
    
    
    
    }
}

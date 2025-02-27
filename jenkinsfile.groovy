pipeline {
    agent { label 'master-machine' } 
    stages {
        stage('Checkout') {
            steps {
                git branch : 'main', url: 'https://github.com/djibril-marega/app-test'
            }
        }
        stage('Build') {
            agent { label 'master-machine' }
            steps {
                sh docker.sh 
            }
        }
    }
}
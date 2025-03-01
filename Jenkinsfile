pipeline {
    agent { label 'built-in' } 
    stages {
        stage('Checkout') {
            steps {
                git branch : 'main', url: 'https://github.com/djibril-marega/app-test'
            }
        }
    }
}

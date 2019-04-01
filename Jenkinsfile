pipeline{
    agent any

    stages {
        stage('Complie Stage') {
            steps{
                withMaven(maven:'M3'){
                    sh 'mvn clean complie'
                }
            }
        }

        stage('Testing Stage') {
            steps{
                withMaven(maven:'M3'){
                    sh 'mvn test'
                }
            }
        }

        stage('Complie Stage') {
            steps{
                withMaven(maven:'M3'){
                    sh 'mvn deploy'
                }
            }
        }
    }
}
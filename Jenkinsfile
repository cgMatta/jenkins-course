// Jenkins File

pipeline {
    agent any

    environment {
        MY_ENV_VAR = 'custom value'

    }

    stages {
        stage('checkout') {
            steps {
                script {
                    def gitRepoUrl = 'https://github.com/cgMatta/jenkins-course.git'

                    checkout([ $class: 'GitSCM',
                               branches: [[name: '*/main']],
                               userRemoteConfigs: [[url: gitRepoUrl]],
                               extensions: [[$class: 'CleanBeforeCheckout'], [$class: 'CloneOption', noTags: false, shallow: true, depth: 1]]
                    ])
                }
            }
        }

        stage('build') {
            steps {
                sh '''
                    ls
                    echo "In build stage"
                '''
            }
        }

        stage('test') {
            steps {
                sh 'echo "In test stage"'
            }
        }

        stage('deploy') {
            steps {
                sh 'echo "I deploy stage: value of ENV var is: ${MY_ENV_VAR}"'
            }
        }
    }

    post {
        success {
            echo 'succeeded'
        }
        failure {
            echo 'pipeline failed!'
        }
    }

}
class CI {

    static void main(String[] args) {

        pipeline {
            agent any

            stages {
                stage('Checkout') {
                    steps {
                        git url: 'https://your-repository-url.git', branch: 'main'
                    }
                }

                stage('Build') {
                    steps {
                        sh 'mvn clean install'
                    }
                }

                stage('Test') {
                    steps {
                        sh 'mvn test'
                    }
                }

                stage('Deploy') {
                    when {
                        branch 'main'
                    }
                    steps {
                        echo 'Deploying to the staging environment...'
                        // Add your deployment steps here, for example:
                        // sh 'your-deployment-script.sh'
                    }
                }
            }

            post {
                failure {
                    // Send a notification in case of a failure
                    // For example, using the email-ext plugin:
                    // emailext subject: "Build failed: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                    //          body: "Check the build log for details: ${env.BUILD_URL}",
                    //          to: 'developers@example.com'
                }
            }
        }


    }
}

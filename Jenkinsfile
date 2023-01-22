pipeline {
    agent {
        node {
            customWorkspace "/root/jenkns_wkspc/${env.JOB_NAME}"
        }
    }

    stages {
        stage('Checkout') {
            script {
                checkout scmGit(
                    branches: [[name: branch]],
                    extensions: [lfs()],
                    userRemoteConfigs: [[credentialsId: 'root'. url:'git@github.com:ukorrapaty/TestJenkinsSetup.git']]
                    )
            }
        }
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
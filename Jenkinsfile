#!groovy

@Library('jnkns_lib') _

pipeline {
    agent {
        node {
            label ''
            customWorkspace "/var/lib/jenkins/test_wk/${env.JOB_NAME}"
        }
    }

    stages {
        stage('Checkout') {
            steps {
                script {
                    checkout scmGit(
                        branches: [[name: 'master']],
                        userRemoteConfigs: [[credentialsId: '69b883b0-79be-47c7-a13f-9821b9bdeee0', url:'git@github.com:ukorrapaty/TestJenkinsSetup.git']]
                    )
                }
            }
        }
        stage('Build') {
            steps {
                echo 'Building..'
                script {
                    sh "ls"
                    sh "ls /var/lib/jenkins/test_wk/${env.JOB_NAME}"
                }
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

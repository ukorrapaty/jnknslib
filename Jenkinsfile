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
		    dir('jnknslib') {
		    	checkout scmGit(
                        	branches: [[name: 'main']],
                        	userRemoteConfigs: [[credentialsId: '69b883b0-79be-47c7-a13f-9821b9bdeee0', url:'git@github.com:ukorrapaty/jnknslib.git']]
                    	)
		    }
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

		    script {
			sh "python3 jnknslib/Scripts/rebase.py"
			masterNode=Jenkins.getInstance().getComputer('').getHostName()
		    	echo "Master node is: ${masterNode}"
			    echo "BUILD URL is: ${BUILD_URL}"
			    logURL="${BUILD_URL}log""
			    logURL=" http://44.211.165.92:8080/job/test/69/log"
			    echo "Log URL is: ${logURL}"
			response = httpRequest(
    				authentication:  'uma', 
   				consoleLogResponseBody: true,
				url:  "${logURL}", 
    				wrapAsMultipart: false
			)
			//    response = httpRequest "${logURL}"
			    echo "Response is: ${response}"
		    }
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}

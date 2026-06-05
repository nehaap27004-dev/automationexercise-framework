pipeline {

	
	agent any
	
	tools {
	
	    jdk 'JDK21'
	
	    maven 'Maven3'
	}
	
	stages {
	
	    stage('Clone Repository') {
	
	        steps {
	
	            git 'https://github.com/nehaap27004-dev/automationexercise-framework.git'
	        }
	    }
	
	    stage('Build and Test') {
	
	        steps {
	
	            bat 'mvn clean test'
	        }
	    }
	}
	
	post {
	
	    always {
	
	        archiveArtifacts artifacts: 'reports/*.*',
	                fingerprint: true
	    }
	
	    success {
	
	        echo 'Framework executed successfully.'
	    }
	
	    failure {
	
	        echo 'Framework execution failed.'
	    }
	}

}

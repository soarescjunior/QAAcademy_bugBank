pipeline {
    agent any
    tools {
      maven 'MAVEN_HOME'
      jdk 'JAVA_HOME'
    }
    stages {
        stage('Testes e2e') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/soarescjunior/QAAcademy_bugBank.git'

                // Run Maven on a Unix agent.
                bat "mvn -Dtest=Runner test"
                //bat "mvn -Dtest=Runner test"

            }
        }
    }
}
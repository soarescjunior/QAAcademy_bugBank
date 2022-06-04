pipeline {
 agent any
        environment {
                PATH = "C:/ProgramData/chocolatey/lib/maven/apache-maven-3.8.4 /bin:$PATH"
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
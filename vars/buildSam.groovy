def call(String name = "Dce20/treasure-data") {
    pipeline {
        agent any
        stages {
            stage('Even Stage') {
                steps {
                    echo "The build number is even: ${name}"
                }
            }
        }
    }
}
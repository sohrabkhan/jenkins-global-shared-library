def call() {
    pipeline {
        agent any
        stages {
            stage('Cleanup workspace') {
                steps {
                    echo "Cleanup"
                }
            }
            stage('Build') {
                steps {
                    buildSam "devops-metrics-project"
                    // echo "Build"
                }
            }
        }
    }
}

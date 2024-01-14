
stage('Run gitleaks') {
            steps {
                script {
                    // Use 'sh' for Unix-based agents or 'bat' for Windows agents
                    def command = isUnix() ? 'gitleaks detect -v' : 'gitleaks.exe detect -v'
                    sh command
                }
            }
}

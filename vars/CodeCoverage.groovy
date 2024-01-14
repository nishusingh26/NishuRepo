def codeCoverage() {
    stage('Code Coverage') {
        sh 'mvn cobertura:cobertura '
    }
}

def dependencyCheck() {
    stage('Dependency Check') {
        sh 'mvn dependency-check:check'
    }
}

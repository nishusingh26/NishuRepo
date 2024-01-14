def dependencyCheck() {
        sh 'mvn dependency-check:check'
}

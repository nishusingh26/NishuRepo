def unitTest() {
    stage('Unit Testing') {
        sh 'mvn checkstyle:checkstyle'
        sh 'mvn findbugs:findbugs'
        sh 'mvn pmd:pmd'
    }
}
def unitTest() {
        sh 'mvn checkstyle:checkstyle'
        sh 'mvn findbugs:findbugs'
}

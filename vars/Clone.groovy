def gitClone() {
    stage('Code Checkout') {
        git branch: 'java7', url: 'https://github.com/opstree/spring3hibernate.git'
    }
}  

def call(dirName) {
  dir ('app') {
    //test the app according to README instructions
    script {
      sh "npm install"
      sh "npm run test"   
    }
  }
}

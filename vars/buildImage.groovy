#!/usr/bin/env groovy

def call(String imageName) {
    withCredentials([usernamePassword(credentialsId: 'docker', passwordVariable: 'PASSWORD', usernameVariable: 'USER')]) {
    //sh "docker build -t makecake/mod-8-example-app:${BUILD_VERSION} ."
    sh "docker build -t $imageName ."
    sh "echo $PASSWORD | docker login -u $USER --password-stdin"
    //sh "docker push makecake/mod-8-example-app:${BUILD_VERSION}"
    sh "docker push $imageName"
    }
}
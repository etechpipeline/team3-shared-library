# jenkins-shared-library
Configurations:
1. Create a shared git repo library on github
2. Go on Jenkins UI and Configure Jenkins Library
3.      Create a vars folder and inside the vars folder insert def call(String repoUrl){} function and inside the declarative script inside
4. Create individual repo for each application on github
5.    then create a Jenkinsfile on each repo
6.    then insert the following in the Jenkinsfile:
7.      @Library(<'name of the shared library repo'>) _
        <name of the groovy file in the shared library repo> <individual git repo>
6. Create & configure individual Jenkins pipeline for each application on Jenkins

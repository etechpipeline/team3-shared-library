def call(String repoUrl){
  pipeline {
        agent any
        stages {
            stage('version-control'){
                steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: '27ad29e6-be3a-49fa-8285-afa75c144e11', url: 'https://github.com/etechpipeline/parallel-pipeline-jenkins.git']]])
                }
            }
            stage('1-parallel-job'){
                parallel{
                    stage('sub-job-1'){
                        steps{
                            sh 'df -h'
                            sh 'free -h'
                            sh 'lscpu'
                            echo 'Good Morning'
                        }
                    }
                    stage('sub-job-2'){
                        steps{
                            sh ('chmod +x system_check.sh && ./system_check.sh')
                        }
                    }
                }
            }
            stage('2-parallel-job'){
                parallel{
                    stage('mimi-sub-job-3'){
                        steps{
                            sh ('chmod +x system_check.sh && ./system_check.sh')
                        }
                    }
                    stage('Emmanuel-sub-job-4'){
                        steps{
                            sh ('chmod +x system_check.sh && ./system_check.sh')
                        }
                    }
                }
            }
            stage('3-parallel-job'){
                parallel{
                    stage('Innocent-sub-job-4'){
                        steps{
                            sh ('chmod +x system_check.sh && ./system_check.sh')
                            echo 'Check the status of Jenkins'
                        }
                    }
                    stage('ViVi'){
                        steps{
                            sh ('chmod +x system_check.sh && ./system_check.sh')
                            echo 'Checking the time process has been running'
                        }
                    }
                }
            }
        }
    }
}     

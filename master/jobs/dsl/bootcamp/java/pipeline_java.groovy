pipelineJob('JavaPipeline') {
    definition {
        cpsScm {
            lightweight(true)
            scm {
                gitSCM {
                    branches {
                        branchSpec {
                            name('*/main')
                        }
                    }
                    userRemoteConfigs {
                        userRemoteConfig {
                            url('git@github.com:yikiksistemci/maven-example.git')
                            credentialsId('github-ssh-private-key')
                            name('origin')
                            refspec('')
                        }
                    }
                    doGenerateSubmoduleConfigurations(false)
                    browser {
                    }
                    gitTool('')
                }
            }
            scriptPath('./Jenkinsfile')
        }
    }
}

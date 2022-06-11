pipelineJob('PythonPipeline') {
    definition {
        cpsScm {
            lightweight(true)
            scm {
                gitSCM {
                    branches {
                        branchSpec {
                            name('*/master')
                        }
                    }
                    userRemoteConfigs {
                        userRemoteConfig {
                            url('git@github.com:yikiksistemci/content-pipelines-cje-labs.git')
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

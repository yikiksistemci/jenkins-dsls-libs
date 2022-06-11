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
                            url('https://github.com/yikiksistemci/content-pipelines-cje-labs.git')
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

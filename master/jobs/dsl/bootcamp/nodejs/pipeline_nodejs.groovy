pipelineJob('NodeJSPipeline') {
    parameters {
                activeChoiceReactiveParam('REGISTERY') {
                    description('Select Registery')
                    filterable(true)
                    choiceType('SINGLE_SELECT')
                    groovyScript {
                        script('''["DockerHub", "GitLabRegistery"]''')
                        fallbackScript('"fallback choice"')
                    }
                    referencedParameter('')
                }
                textParam("IMAGETAG", 'Lutfen vermek istediginiz image-tagi seciniz...')
    }

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
                            url('git@github.com:yikiksistemci/node-example.git')
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

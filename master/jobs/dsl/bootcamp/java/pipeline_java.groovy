// NGNTest Migration path: jobs/dsls/devops/preprod-jobs/pipeline_prepare_testbox_for_dep_issue.groovy

pipelineJob('Java Pipeline') {
    parameters {
                activeChoiceReactiveParam('Registery') {
                    description('Select Registery')
                    filterable(true)
                    choiceType('SINGLE_SELECT')
                    groovyScript {
                        script('''
        import jenkins.model.*
        def docker_registery_list = [ "DockerHub", "GitLab Image Registery" ]
        return docker_registery_list
        ''')
                        fallbackScript('')
                    }
                    referencedParameter('')
                }
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
                            url('https://github.com/yikiksistemci/node-example.git')
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
            scriptPath('./jenkinsfile')
        }
    }
}

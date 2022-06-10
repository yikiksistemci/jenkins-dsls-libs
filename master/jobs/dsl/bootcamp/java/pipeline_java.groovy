// NGNTest Migration path: jobs/dsls/devops/preprod-jobs/pipeline_prepare_testbox_for_dep_issue.groovy

pipelineJob('JavaPipeline') {
    parameters {
                activeChoiceReactiveParam('TestBox') {
                    description('Select TestBox')
                    filterable(true)
                    choiceType('SINGLE_SELECT')
                    groovyScript {
                        script('''
        import jenkins.model.*
        def docker_registery_list = ["DockerHub", "GitLab Image Registery" ]
        return list
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

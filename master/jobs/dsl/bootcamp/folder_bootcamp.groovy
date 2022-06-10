folder('Project-A') {
    displayName('Bootcamp Pipelines')
    description('Add all jobs to here for Bootcamp')
    views {
        listView('NodeJS'){
            description('NodeJS Pipelines')
            filterBuildQueue()
            filterExecutors()
            recurse()
            jobs {
                regex('project-a-nodejs-*')
            }
            columns {
                status()
                weather()
                name()
                lastSuccess()
                lastFailure()
                lastDuration()
                buildButton()
                lastBuildConsole()
            }
    }
    }
}
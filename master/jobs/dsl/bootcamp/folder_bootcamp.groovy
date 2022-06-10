folder('Bootcamp') {
    displayName('Bootcamp Pipelines')
    description('Add all jobs to here for Bootcamp')
    listView('NodeJS-Bootcamp-Folder'){
        description('Bootcamp Pipelines')
        filterBuildQueue()
        filterExecutors()
        recurse()
        jobs {
            regex('bootcamp-*')
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
listView('NodeJS'){
    description('NodeJS Pipelines')
    filterBuildQueue()
    filterExecutors()
    recurse()
    jobs {
        regex('nodejs-*')
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
listView('NodeJS'){
    description('NodeJS Pipelines')
    filterBuildQueue()
    filterExecutors()
    recurse()
    jobs {
        regex('NodeJS*')
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
listView('Bootcamp'){
    description('Bootcamp Pipelines')
    filterBuildQueue()
    filterExecutors()
    recurse()
        columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
        lastBuildConsoleColumn()
    }
}
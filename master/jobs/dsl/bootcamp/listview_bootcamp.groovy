listView('Bootcamp'){
    description('Bootcamp Pipelines')
    filterBuildQueue()
    filterExecutors()
    recurse()
    jobs {
        regex('NodeJS/.*')
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
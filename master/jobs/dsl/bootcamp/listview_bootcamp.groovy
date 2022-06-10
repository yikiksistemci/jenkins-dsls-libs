listView('Bootcamp'){
    description('Bootcamp Pipelines')
    filterBuildQueue()
    filterExecutors()
    recurse()
    jobs {
        regex('bootcamp/.*')
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
listView('Python'){
    description('Python Pipelines')
    filterBuildQueue()
    filterExecutors()
    recurse()
    jobs {
        regex('python-*')
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
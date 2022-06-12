listView('Java'){
    description('Java Pipelines')
    filterBuildQueue()
    filterExecutors()
    recurse()
    jobs {
        name('JavaPipeline')
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
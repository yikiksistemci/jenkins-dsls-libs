listView('Java'){
    description('Java Pipelines')
    filterBuildQueue()
    filterExecutors()
    recurse()
    jobs {
        name('JavaPipeline')
        name('JavaPipeline2')
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
listView('NodeJS'){
    description('NodeJS Pipelines')
    filterBuildQueue()
    filterExecutors()
    recurse()
    jobs {
        name('NodeJSPipeline')
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
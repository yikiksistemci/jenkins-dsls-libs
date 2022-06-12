listView('NodeJS'){
    description('NodeJS Pipelines')
    filterBuildQueue()
    filterExecutors()
    recurse()
    jobs {
        name('NodeJSPipeline')
        name('NodeJSPipeline2')
        name('NodeJSPipeline3')
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
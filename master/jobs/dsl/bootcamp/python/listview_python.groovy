listView('Python'){
    description('Python Pipelines')
    filterBuildQueue()
    filterExecutors()
    recurse()
    jobs {
        name('PythonPipeline')
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
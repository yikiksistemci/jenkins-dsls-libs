job('Java SeedJobs Bootcamp') {
    triggers {
        cron('*/5 * * * *')
    }
    scm {
      git {
        remote {
          url('https://github.com/yikiksistemci/jenkins-dsls-libs.git')
        }
        branch('main')
      }
    }
    steps {
      jobDsl {
        targets('master/jobs/dsl/bootcamp/**/*.groovy')
        ignoreExisting(true)
      }
    }
}
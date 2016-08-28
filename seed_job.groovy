freeStyleJob('seed_job'){
	scm {
        git {
            remote {
                name('unity-jenkins github')
                url('https://github.com/alexthaii/unity-jenkins.git')
            }
        }    
    }

    triggers {
        githubPush()
    }

    steps {
        dsl {
             dsl(['seed_job.groovy'], 'DELETE')
        }
    }
}
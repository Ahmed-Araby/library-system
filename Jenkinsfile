pipeline{
    agent any
    triggers{
        cron('H/1 * * * *')
    }
    stages {
        stage("hello-word"){
            steps{
                echo "hello world from spring boot application [dev branch]"
                echo "trigger w orks f ine  "
            }
        }
    }
}
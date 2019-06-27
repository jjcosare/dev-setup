# [Coursera - Functional Programming Fundamentals in Scala](https://www.coursera.org/learn/progfun1)

> Base Project for Weekly Assignments : Setup

1. Please refer to `./coursera-progfun1` as base project

1. Copy the folder `./coursera-progfun1` on your desired location

1. Upload the contents of `coursera-progfun1` to your github repo

1. Import the project to intellij using `coursera-progfun1/build.sbt`

1. Open `coursera-progfun1/.gitignore` and add on last line `*/build.sbt` then commit changes to your github repo

1. Uncomment `line 14` of all sub-projects build.sbt `w*-*/build.sbt`

1. Note: `coursera-progfun1` is structured as a multi-module project but this is only used to resolve project detection by intellij's sbt plugin and hence we can't use the main project to `submit` answers to coursera

1. Using intellij's terminal, change directory to your desired sub-project (`$ cd w1-example`) and then run `$ submit {email} {token}` to pass your answers to coursera

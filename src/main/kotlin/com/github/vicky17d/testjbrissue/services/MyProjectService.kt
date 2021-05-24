package com.github.vicky17d.testjbrissue.services

import com.github.vicky17d.testjbrissue.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

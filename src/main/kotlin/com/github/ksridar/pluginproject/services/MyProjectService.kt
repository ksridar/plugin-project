package com.github.ksridar.pluginproject.services

import com.intellij.openapi.project.Project
import com.github.ksridar.pluginproject.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

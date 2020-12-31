package com.github.zhuhongbozhuhongbo.pluginlearn.services

import com.intellij.openapi.project.Project
import com.github.zhuhongbozhuhongbo.pluginlearn.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

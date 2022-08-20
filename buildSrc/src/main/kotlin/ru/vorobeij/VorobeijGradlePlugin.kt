package ru.vorobeij

import org.gradle.api.Plugin
import org.gradle.api.Project

open class VorobeijGradlePlugin : Plugin<Project> {

    override fun apply(project: Project) {

        // val config: VorobeijGradleExtension = project.extensions.create(
        //     "vorobeij", VorobeijGradleExtension::class.java
        // )

        project.configureAndroid()
        project.configureLint()
    }
}



package ru.vorobeij

import com.android.build.gradle.api.AndroidBasePlugin
import org.gradle.api.Project

internal fun Project.containsAndroidPlugin(): Boolean {
    return project.plugins.toList().any { plugin -> plugin is AndroidBasePlugin }
}
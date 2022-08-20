package ru.vorobeij

import TestLibs
import org.gradle.api.Project

fun Project.testDependencies() = dependencies.apply {
    add("androidTestImplementation", TestLibs.junit_test_ext)
    add("androidTestImplementation", TestLibs.espresso_core)
    add("androidTestImplementation", TestLibs.compose_ui_test_junit4)
    add("testImplementation", TestLibs.junit)
}


pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven { url = uri("https://plugins.gradle.org/m2/") }
    }
    plugins {
        id("com.android.test") version "7.2.2"
        id("org.jetbrains.kotlin.android") version "1.7.10"
    }
}

plugins {
    id("de.fayard.refreshVersions").version("0.40.2")
}

refreshVersions {
    rejectVersionIf {
        val unstableRegex = Regex("(alpha|beta|rc)\\d*", RegexOption.IGNORE_CASE)
        candidate.value.contains(unstableRegex)
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Android App Template"
include(
    ":app",
    ":main",
    ":microbenchmark",
    ":macrobenchmark"
)

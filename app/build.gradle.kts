plugins {
    id(Plugins.application)
    id(Plugins.kotlin_android)
    id(Plugins.vorobeij)
}

android {
    defaultConfig {
        versionCode = 1
        versionName = "1.0.0"
    }
}

dependencies {
    implementation(project(Projects.main))
}

// https://github.com/autonomousapps/dependency-analysis-android-gradle-plugin/wiki/Customizing-plugin-behavior
dependencyAnalysis {
    issues {
        // configure for all projects
        // set behavior for all issue types
        ignoreKtx(true)
        onAny {
            severity("fail") // default is 'warn'
            exclude(
                ":main",
                "org.jetbrains.kotlin:kotlin-stdlib-jdk8"
            )
        }
    }
}
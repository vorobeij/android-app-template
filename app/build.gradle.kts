import ru.vorobeij.testDependencies

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
    testDependencies()
}

// https://github.com/autonomousapps/dependency-analysis-android-gradle-plugin/wiki/Customizing-plugin-behavior
dependencyAnalysis {
    issues {
        ignoreKtx(true)
        onAny {
            severity("fail")
            exclude(
                ":main",
                "org.jetbrains.kotlin:kotlin-stdlib-jdk8"
            )
        }
    }
}
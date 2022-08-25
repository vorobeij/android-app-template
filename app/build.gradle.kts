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

    buildTypes {
        create("benchmark") {
            signingConfig = signingConfigs.getByName("debug")
            matchingFallbacks.add("release")
            isDebuggable = false
            matchingFallbacks.plusAssign(listOf("release"))
        }
    }
}

dependencies {
    implementation(project(Projects.main))
    androidTestImplementation(AndroidX.test.ext.junit)
    androidTestImplementation(AndroidX.test.espresso.core)
    androidTestImplementation(AndroidX.compose.ui.testJunit4)
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
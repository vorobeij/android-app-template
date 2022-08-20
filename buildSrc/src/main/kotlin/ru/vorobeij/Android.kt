package ru.vorobeij

import Runners
import Versions
import com.android.build.gradle.BaseExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

private typealias AndroidBaseExtension = BaseExtension

internal fun Project.configureAndroid() {
    extensions.getByType<AndroidBaseExtension>().run {
        compileSdkVersion(Versions.targetSdk)
        defaultConfig {
            minSdk = Versions.minSdk
            targetSdk = Versions.targetSdk
            // todo get versionCode and versionName from config
            // versionCode = vorobeijGradleExtension.versionCode
            // versionName = vorobeijGradleExtension.versionName
            testInstrumentationRunner = Runners.androidJunit
            consumerProguardFiles("consumer-rules.pro")
            vectorDrawables {
                useSupportLibrary = true
            }
        }

        buildTypes {
            getByName("release") {
                isMinifyEnabled = true
                proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
            }

            getByName("debug") {
                isTestCoverageEnabled = true
            }
        }

        packagingOptions {
            resources {
                excludes += "/META-INF/{AL2.0,LGPL2.1}"
                excludes += "META-INF/NOTICE.txt"
            }
        }
        compileOptions {
            sourceCompatibility = Versions.jvm
            targetCompatibility = Versions.jvm
        }
    }
}

fun Project.configureCompose() = this.extensions.getByType<AndroidBaseExtension>().run {
    buildFeatures.compose = true
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.compose_compiler
    }
}

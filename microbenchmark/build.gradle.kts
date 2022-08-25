plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("androidx.benchmark")
    id("ru.vorobeij")
}

android {

    testBuildType = "release"
    buildTypes {
        getByName("debug") {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "benchmark-proguard-rules.pro"
            )
        }
        getByName("release") {
            isDefault = true
        }
    }
}

android.defaultConfig.testInstrumentationRunner = "androidx.benchmark.junit4.AndroidBenchmarkRunner"

dependencies {
    implementation(project(":main"))
    androidTestImplementation(AndroidX.test.runner)
    androidTestImplementation(AndroidX.test.ext.junit)
    androidTestImplementation(Testing.junit4)
    androidTestImplementation(AndroidX.benchmark.junit4)
}
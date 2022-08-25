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
    androidTestImplementation("androidx.test:runner:1.4.0")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.benchmark:benchmark-junit4:1.1.0")
}
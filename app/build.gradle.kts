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

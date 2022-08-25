import ru.vorobeij.configureCompose
import ru.vorobeij.testDependencies

plugins {
    id(Plugins.android_library)
    id(Plugins.kotlin_android)
    id(Plugins.vorobeij)
}

configureCompose()

dependencies {

    api(AndroidX.activity)
    api(AndroidX.compose.runtime)
    api(AndroidX.compose.material3)
    debugRuntimeOnly(AndroidX.compose.ui.testManifest)
    implementation(AndroidX.activity.compose)
    implementation(AndroidX.core)
    implementation(AndroidX.compose.foundation)
    implementation(AndroidX.compose.foundation.layout)
    implementation(AndroidX.compose.ui)
    implementation(AndroidX.compose.ui.graphics)
    implementation(AndroidX.compose.ui.text)
    implementation(AndroidX.compose.ui.toolingPreview)
    implementation(AndroidX.compose.ui.unit)
    testDependencies()
}
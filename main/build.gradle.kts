import ru.vorobeij.configureCompose
import ru.vorobeij.testDependencies

plugins {
    id(Plugins.android_library)
    id(Plugins.kotlin_android)
    id(Plugins.vorobeij)
}

configureCompose()

dependencies {

    api(Libs.activity_compose)
    api(Libs.compose_runtime)
    api(Libs.material3)
    debugRuntimeOnly(TestLibs.compose_ui_test_manifest)
    implementation(Libs.activity_compose)
    implementation(Libs.androidx_core)
    implementation(Libs.compose_foundation)
    implementation(Libs.compose_foundation_layout)
    implementation(Libs.compose_ui)
    implementation(Libs.compose_ui_graphics)
    implementation(Libs.compose_ui_text)
    implementation(Libs.compose_ui_tooling_preview)
    implementation(Libs.compose_ui_unit)
    testDependencies()
}
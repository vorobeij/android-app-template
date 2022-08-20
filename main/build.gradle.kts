import ru.vorobeij.configureCompose
import ru.vorobeij.testDependencies

plugins {
    id(Plugins.android_library)
    id(Plugins.kotlin_android)
    id(Plugins.vorobeij)
}

configureCompose()

dependencies {

    // todo check these dependencies are unused with a plugin
    implementation("androidx.core:core-ktx:1.8.0")
    implementation("androidx.appcompat:appcompat:1.5.0")
    implementation("com.google.android.material:material:1.6.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")

    implementation(Libs.core_ktx)

    implementation(Libs.compose_ui)
    implementation(Libs.compose_ui_tooling_preview)
    debugImplementation(Libs.compose_ui_tooling)
    debugImplementation(TestLibs.compose_ui_test_manifest)

    implementation(Libs.material3)
    implementation(Libs.lifecycle_runtime_ktx)
    implementation(Libs.activity_compose)

    testDependencies()
}
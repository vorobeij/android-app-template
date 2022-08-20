import org.gradle.api.JavaVersion

object Versions {

    val jvm = JavaVersion.VERSION_17

    const val androidGradlePlugin = "7.2.2"
    const val targetSdk = 33
    const val minSdk = 23
    const val kotlin = "1.7.10"

    const val compose = "1.2.1"
    const val compose_compiler = "1.3.0"
    const val androidx = "1.8.0"
}

/**
 * Move version string to versions only if there is more than one dependency with that version
 *
 */
object Libs {

    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$${Versions.kotlin}"

    const val activity_compose = "androidx.activity:activity-compose:1.5.1"
    const val androidx_core = "androidx.core:core:${Versions.androidx}"
    const val androidx_core_ktx = "androidx.core:core-ktx:${Versions.androidx}"
    const val compose_foundation = "androidx.compose.foundation:foundation:${Versions.compose}"
    const val compose_foundation_layout = "androidx.compose.foundation:foundation-layout:${Versions.compose}"
    const val compose_runtime = "androidx.compose.runtime:runtime:${Versions.compose}"
    const val compose_ui = "androidx.compose.ui:ui:${Versions.compose}"
    const val compose_ui_graphics = "androidx.compose.ui:ui-graphics:${Versions.compose}"
    const val compose_ui_text = "androidx.compose.ui:ui-text:${Versions.compose}"
    const val compose_ui_tooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"
    const val compose_ui_tooling_preview = "androidx.compose.ui:ui-tooling-preview:${Versions.compose}"
    const val compose_ui_unit = "androidx.compose.ui:ui-unit:${Versions.compose}"
    const val lifecycle_runtime_ktx = "androidx.lifecycle:lifecycle-runtime-ktx:2.5.1"
    const val material3 = "androidx.compose.material3:material3:1.0.0-alpha16"
}

object TestLibs {
    const val espresso_core = "androidx.test.espresso:espresso-core:3.4.0"
    const val junit = "junit:junit:4.13.2"
    const val junit_test_ext = "androidx.test.ext:junit:1.1.3"
    const val compose_ui_test_junit4 = "androidx.compose.ui:ui-test-junit4:${Versions.compose}"
    const val compose_ui_test_manifest = "androidx.compose.ui:ui-test-manifest:${Versions.compose}"
}

object Runners {
    const val androidJunit = "androidx.test.runner.AndroidJUnitRunner"
}

object Plugins {
    const val android_library = "com.android.library"
    const val application = "com.android.application"
    const val kotlin_android = "org.jetbrains.kotlin.android"
    const val vorobeij = "ru.vorobeij"
}

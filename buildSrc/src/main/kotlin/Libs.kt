import org.gradle.api.JavaVersion

object Versions {

    val jvm = JavaVersion.VERSION_17

    const val targetSdk = 33
    const val minSdk = 23

    const val compose_compiler = "_"
}

/**
 * Move version string to versions only if there is more than one dependency with that version
 */
object Libs {

    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:_"

    const val activity_compose = "androidx.activity:activity-compose:_"
    const val androidx_core = "androidx.core:core:_"
    const val androidx_core_ktx = "androidx.core:core-ktx:_"
    const val compose_foundation = "androidx.compose.foundation:foundation:_"
    const val compose_foundation_layout = "androidx.compose.foundation:foundation-layout:_"
    const val compose_runtime = "androidx.compose.runtime:runtime:_"
    const val compose_ui = "androidx.compose.ui:ui:_"
    const val compose_ui_graphics = "androidx.compose.ui:ui-graphics:_"
    const val compose_ui_text = "androidx.compose.ui:ui-text:_"
    const val compose_ui_tooling = "androidx.compose.ui:ui-tooling:_"
    const val compose_ui_tooling_preview = "androidx.compose.ui:ui-tooling-preview:_"
    const val compose_ui_unit = "androidx.compose.ui:ui-unit:_"
    const val lifecycle_runtime_ktx = "androidx.lifecycle:lifecycle-runtime-ktx:_"
    const val material3 = "androidx.compose.material3:material3:_"
}

object TestLibs {
    const val espresso_core = "androidx.test.espresso:espresso-core:_"
    const val junit = "junit:junit:_"
    const val junit_test_ext = "androidx.test.ext:junit:_"
    const val compose_ui_test_junit4 = "androidx.compose.ui:ui-test-junit4:_"
    const val compose_ui_test_manifest = "androidx.compose.ui:ui-test-manifest:_"
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

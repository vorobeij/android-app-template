import org.gradle.api.JavaVersion

object Versions {

    val jvm = JavaVersion.VERSION_11

    const val targetSdk = 33
    const val minSdk = 23

    const val compose_compiler = "_"
}

object TestLibs {
    const val compose_ui_test_junit4 = "androidx.compose.ui:ui-test-junit4:_"
    const val compose_ui_test_manifest = "androidx.compose.ui:ui-test-manifest:_"
    const val espresso_core = "androidx.test.espresso:espresso-core:_"
    const val junit = "junit:junit:_"
    const val junit_test_ext = "androidx.test.ext:junit:_"
}

object Runners {
    const val androidJunit = "androidx.test.runner.AndroidJUnitRunner"
}

object Plugins {
    const val android_library = "com.android.library"
    const val application = "com.android.application"
    const val kotlin_android = "org.jetbrains.kotlin.android"
    const val vorobeij = "ru.vorobeij"
    const val dependency_analysis = "com.autonomousapps.dependency-analysis"
}

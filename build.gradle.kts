buildscript {

    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    // todo migrate to gradle.settings
    dependencies {
        classpath(Android.tools.build.gradlePlugin)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:_")
        classpath("com.autonomousapps:dependency-analysis-gradle-plugin:_")
    }
}
apply(plugin = "com.autonomousapps.dependency-analysis")

tasks.create<Delete>("clean") {
    delete(
        fileTree(rootProject.buildDir)
    )
}

allprojects {
    project.tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            jvmTarget = Versions.jvm.toString()
        }
    }
}

tasks.register<GradleBuild>("runChecks") {
    tasks = listOf(
        "clean",
        "buildHealth",
        "build"
    )
}

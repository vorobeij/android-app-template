plugins {
    id(Plugins.dependency_analysis)
    id("androidx.benchmark").version("1.1.0").apply(false)
}

tasks.create<Delete>("clean") {
    delete(
        fileTree(rootProject.buildDir)
    )
}

allprojects {
    project.tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            jvmTarget = Versions.jvm.toString()
            allWarningsAsErrors = true
        }
    }
    project.tasks.withType<JavaCompile> {
        sourceCompatibility = Versions.jvm.toString()
        targetCompatibility = Versions.jvm.toString()
    }
}

tasks.register<GradleBuild>("runChecks") {
    tasks = listOf(
        "clean",
        "buildHealth",
        "build"
    )
}

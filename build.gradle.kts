plugins {
    id("com.autonomousapps.dependency-analysis").version("1.12.0")
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

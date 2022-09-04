plugins {
    id(Plugins.dependency_analysis)
    id("androidx.benchmark").apply(false)
    id("org.cqfn.diktat.diktat-gradle-plugin")
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

    apply(plugin = "org.cqfn.diktat.diktat-gradle-plugin")
    configure<org.cqfn.diktat.plugin.gradle.DiktatExtension> {
        diktatConfigFile = rootProject.file("diktat-analysis.yml")
        inputs {
            exclude("src/resources/**/*.kt")
            include("src/**/*.kt")
        }
    }
}

apply(from = "./ci/testrules/kotlin-tests-rule.gradle")

tasks.register<GradleBuild>("runChecks") {
    tasks = listOf(
        "clean",
        "kotlinTestRule",
        "refreshVersions",
        "buildHealth",
        "build",
        "diktatFix"
    )
    outputs
        .dir(layout.buildDirectory.dir("runChecks"))
        .withPropertyName("outputDir")
}

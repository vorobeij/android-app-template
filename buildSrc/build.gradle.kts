plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    google()
}

dependencies {
    // ⚠️ Important: after ./gradlew refreshVersions put these lines back ⚠️
    implementation("com.android.tools.build:gradle:7.2.2")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.10")
    implementation(gradleApi())
    implementation(localGroovy())
}
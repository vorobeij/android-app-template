package ru.vorobeij

import com.android.build.gradle.BaseExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

private typealias BaseAppExtension = BaseExtension

internal fun Project.configureLint() = this.extensions.getByType<BaseAppExtension>().run {

    // https://developer.android.com/reference/tools/gradle-api/4.1/com/android/build/api/dsl/LintOptions
    lintOptions {
        baseline("lint-baseline.xml")
        isQuiet = true
        isAbortOnError = true
        isCheckReleaseBuilds = true
        isIgnoreWarnings = false
        isCheckAllWarnings = true
        isWarningsAsErrors = true
        isNoLines = false
        isShowAll = true
        isExplainIssues = true
        lintConfig = file("default-lint.xml")
        textReport = true
        textOutput = file("lint-output.txt")
        xmlReport = false
        htmlReport = false
        isCheckTestSources = true
        isIgnoreTestSources = true
        isCheckGeneratedSources = true
        isCheckDependencies = false
        disable.addAll(arrayOf("TypographyFractions", "TypographyQuotes"))
        enable.addAll(arrayOf("RtlHardcoded", "RtlCompat", "RtlEnabled"))
        checkOnly.addAll(arrayOf("NewApi", "InlinedApi"))
        fatal("NewApi", "InlinedApi")
        error("Wakelock", "TextViewEdits")
        warning("ResourceAsColor")
        informational("StopShip")
    }
}

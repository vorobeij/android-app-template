# Remove unused dependencies from modules

[dependency-analysis-android-gradle-plugin](https://github.com/autonomousapps/dependency-analysis-android-gradle-plugin)

```bash
./gradlew buildHealth
```

### Ignore dependencies

```kotlin
// https://github.com/autonomousapps/dependency-analysis-android-gradle-plugin/wiki/Customizing-plugin-behavior
dependencyAnalysis {
    issues {
        ignoreKtx(true)
        onAny {
            severity("fail")
            exclude(
                ":main",
                "org.jetbrains.kotlin:kotlin-stdlib-jdk8"
            )
        }
    }
}
```
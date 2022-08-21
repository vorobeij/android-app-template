# Libraries versions policy

Keep all libraries to the latest releases. All versions are
at [versions.properties](../versions.properties).

Used plugin [refreshVersions](https://jmfayard.github.io/refreshVersions/)
by [jmfayard](https://github.com/jmfayard)

To **update versions** run

```shell
./gradlew refreshVersions
```

## Adding new library

1. add to [Libs.kt](../buildSrc/src/main/kotlin/Libs.kt)
2. run `./gradlew refreshVersionsMigrate`
3. revert changes at [buildSrc/build.gradle.kts](../buildSrc/build.gradle.kts)
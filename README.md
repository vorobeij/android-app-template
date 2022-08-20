# Template android project

- [First things to do before starting](./wiki/first-things-to-do.md)
- [Modules structure](./wiki/modules-structure.md)

# Features

1. kts build files
2. buildSrc build config
3. fail build on warnings (no warnings policy)

# Remove unused dependencies from modules

[dependency-analysis-android-gradle-plugin](https://github.com/autonomousapps/dependency-analysis-android-gradle-plugin)

```bash
./gradlew buildHealth
```

# Check code correctness

```shell
sh ./ci/release.sh
```

1. todo Gradle config lint
2. todo kotlin code android lint
3. todo fail on warnings
4. todo kotlin detekt
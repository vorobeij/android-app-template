# Template android project

- [First things to do before starting](./wiki/first-things-to-do.md)
- [Modules structure](./wiki/modules-structure.md)
- [Libraries versions policy](./wiki/versions-policy.md)
- [Unused dependencies management](./wiki/unused-dependencies.md)

## Features

- kts build files
- buildSrc build config
- fail build on warnings (zero warnings policy)
- dependencies management with plugin [refreshVersions](https://jmfayard.github.io/refreshVersions/)
- explicitly specify all module dependencies
  with [dependency-analysis-android-gradle-plugin](https://github.com/autonomousapps/dependency-analysis-android-gradle-plugin)

## Check code correctness

```shell
sh ./ci/release.sh
```

1. todo kotlin code android lint
2. todo kotlin detekt

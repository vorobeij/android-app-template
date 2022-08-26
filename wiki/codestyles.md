# Code style

- [Diktat docs](https://github.com/saveourtool/diktat)
- Configure styles at [config](../diktat-analysis.yml)

```shell
./gradlew diktatCheck
./gradlew diktatFix
```

## Why diktat?

`detekt` vs `ktlint` vs `diktat`

**Requirements**

1. Compatible with gradle plugins api (`settings.gradle.kts`) (detekt-)
2. Configurable
3. Autofix is actually working (detekt-)

# TODO

* code autoformat options
    - uncommited files only
    - baseline
    - apply to whole project
# Test source sets mirroring

[Github repo](https://github.com/vorobeij/kotlin-tests-rule)

The proposition is, test packages structure should be the same as source code structure. This is
true only if one creates classes at correct package structure at the first place. But usually,
source code and test code package structure diverge, and there is nothing to tell us when it's
happening.

Run `./gradlew kotlinTestRule` to fix possible issues with code structure.

After extracting code to another module, there will be left test sources. These will be
at `./undefinedTests/`. Move them manually.
#!/bin/sh

# Check gradle configurations, build and run tests
cd ..
./gradlew runChecks
sh ./ci/benchmarks.sh

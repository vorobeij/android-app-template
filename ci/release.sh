#!/bin/sh

# Check gradle configurations, build and run tests
cd ..
./gradlew runChecks
cd ci
sh ./microbenchmarks.sh
sh ./macrobenchmarks.sh

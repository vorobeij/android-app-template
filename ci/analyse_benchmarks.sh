#!/usr/bin/env bash

# TODO remove me
#cp /Users/sj/.m2/repository/ru/vorobeij/benchmark/regress/1.0/*.jar ./regress.jar

STORAGE_FILE=../benchmarks/reports/benchmarks.json
java -jar regress.jar --projectRootPath $(readlink -f ../) \
                      --threshold 10 \
                      --storageFilePath $(readlink -f $STORAGE_FILE)
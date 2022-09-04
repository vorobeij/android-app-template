#!/usr/bin/env bash

# TODO remove me
#cp /Users/sj/.m2/repository/ru/vorobeij/benchmark/regress/1.0/*.jar ./regress.jar

STORAGE_FILE=`pwd`/../benchmarks/reports/benchmarks.json
java -jar regress.jar --projectRootPath `pwd`/.. --threshold 10 --storageFilePath /Users/sj/AndroidApps/AndroidAppTemplate/benchmarks/reports/benchmarks.json
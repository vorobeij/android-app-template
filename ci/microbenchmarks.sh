#!/bin/sh

# Input arguments
BENCHMARK_RESULTS_OUTPUT=~/Desktop
PACKAGE_NAME=ru.vorobeij.android.app.benchmark.test

# Private constants
BENCHMARK_RESULT_OUTPUT_DEVICE=/sdcard/Download
BENCHMARK_RUNNER=androidx.benchmark.junit4.AndroidBenchmarkRunner
ROOT=..

cd $ROOT
# Info: https://developer.android.com/topic/performance/benchmarking/benchmarking-in-ci
./gradlew assembleAndroidTest
#adb install ./app/build/outputs/apk/androidTest/debug/app-debug-androidTest.apk
adb install ./microbenchmark/build/outputs/apk/androidTest/release/microbenchmark-release-androidTest.apk
# List installed instrumentation
adb shell pm list instrumentation
# Launch instrumentation benchmark
adb shell am instrument -w -e additionalTestOutputDir $BENCHMARK_RESULT_OUTPUT_DEVICE \
                        $PACKAGE_NAME/$BENCHMARK_RUNNER \
                        -e no-isolated-storage true
# Pull benchmark results
adb pull $BENCHMARK_RESULT_OUTPUT_DEVICE/$PACKAGE_NAME-benchmarkData.json \
         $BENCHMARK_RESULTS_OUTPUT/$PACKAGE_NAME-test-benchmarkData.json
cat $BENCHMARK_RESULTS_OUTPUT/$PACKAGE_NAME-test-benchmarkData.json | wc -l

#!/bin/sh

# Input arguments
mkdir -p ../benchmarks/json
BENCHMARK_RESULTS_OUTPUT=$(readlink -f ../benchmarks/json)
PACKAGE_NAME=ru.vorobeij.android.app.benchmark.test

# Private constants
BENCHMARK_RESULT_OUTPUT_DEVICE=/sdcard/Download
BENCHMARK_RUNNER=androidx.benchmark.junit4.AndroidBenchmarkRunner
ROOT=..
OUTPUT_JSON_NAME=$PACKAGE_NAME-test-benchmarkData.json

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
         $BENCHMARK_RESULTS_OUTPUT/$OUTPUT_JSON_NAME
cat $BENCHMARK_RESULTS_OUTPUT/$OUTPUT_JSON_NAME | wc -l

# Check for emulators connected:
jsonLines=$(cat $BENCHMARK_RESULTS_OUTPUT/$OUTPUT_JSON_NAME | wc -l)
if [ $jsonLines -lt 1 ]; then
  echo "\n\u001b[31mERROR: benchmark failed\u001b[0m"
  exit 1
fi

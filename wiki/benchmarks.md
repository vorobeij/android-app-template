# Benchmarks

## Read first

1. [codelab](https://developer.android.com/topic/performance/benchmarking/benchmarking-in-ci)
2. [android developer docs](https://developer.android.com/codelabs/android-baseline-profiles-improve)

## Microbenchmarks

To run benchmarks on CI see `ci/microbenchmarks.sh`. Output is json file
at `BENCHMARK_RESULTS_OUTPUT`

## Macrobenchmarks

To run benchmarks on CI see `ci/macrobenchmarks.sh`. There is no output yet

## Automated checks

[Github repo](https://github.com/vorobeij/regress-analytics)

If you see an error, such as

```shell
Benchmark ru.vorobeij.com.example.macrobenchmark.startup.SampleStartupBenchmark.`startup`() is 106% slower!
```

This means, your new code made existing benchmark slower.

### Local usage

1. Run `bundle exec fastlane android benchmarks` after each commit

See [github project](https://github.com/vorobeij/regress-analytics) for more details
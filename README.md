# jmh-benchmark

## Summary

| Sample Size  | Ops  | Mode | Cnt | Score ±Error (ms/op  | 
|---|---|---|---|---|
| **300** |  full |  avgt | 10  |   0.083 ± 0.011 |
| 300 | mod  | avgt  |  10 |  0.124 ± 0.008  |
| 300  |  simple |  avgt | 10  | 0.050 ± 0.009   |
| ===========  |  ====== | ==== | === | ===================   |
| **3000**   |  full | avgt  | 10  |  1.356 ± 0.122 |
| 3000  | mod  | avgt  |  10 |  1.755 ± 0.212  |
| 3000  | simple  |  avgt |  10 | 0.638 ± 0.026   |
| ===========  |  ====== | ==== | === | ===================   |
| **30000**   |  full | avgt  | 10  |  27.023 ± 1.145  |
| 30000  | mod  | avgt  | 10  |  28.883 ± 2.201 |
| 30000  |  simple | avgt  |  10 |  10.995 ± 1.086  |

## Command
`sbt 'jmh:run -i 10 -wi 3 -f 1 -t 1'`

### Case 1. 300 providers (w/ 10% same scores)
```
[info] Compiling 7 Java sources to /Users/sheon.han/zd/benchmark-test/target/scala-2.12/classes ...
[info] running (fork) org.openjdk.jmh.Main -i 10 -wi 3 -f 1 -t 1
[info] # JMH version: 1.21
[info] # VM version: JDK 1.8.0_181, Java HotSpot(TM) 64-Bit Server VM, 25.181-b13
[info] # VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/bin/java
[info] # VM options: <none>
[info] # Warmup: 3 iterations, 10 s eachremental 0s
[info] # Measurement: 10 iterations, 10 s each
[info] # Timeout: 10 min per iteration
[info] # Threads: 1 thread, will synchronize iterations
[info] # Benchmark mode: Average time, time/op
[info] # Benchmark: com.zocdoc.search.benchmarks.ShuffleBenchmarkTests.fullOperations
[info] # Run progress: 0.00% complete, ETA 00:06:30
[info] # Fork: 1 of 1
[info] # Warmup Iteration   1: 0.082 ms/op
[info] # Warmup Iteration   2: 0.077 ms/op
[info] # Warmup Iteration   3: 0.077 ms/op
[info] Iteration   1: 0.076 ms/op
[info] Iteration   2: 0.077 ms/op
[info] Iteration   3: 0.082 ms/op
[info] Iteration   4: 0.078 ms/op
[info] Iteration   5: 0.081 ms/op
[info] Iteration   6: 0.083 ms/op
[info] Iteration   7: 0.081 ms/op
[info] Iteration   8: 0.083 ms/op
[info] Iteration   9: 0.102 ms/op
[info] Iteration  10: 0.086 ms/op
[info] Result "com.zocdoc.search.benchmarks.ShuffleBenchmarkTests.fullOperations":
[info]   0.083 ±(99.9%) 0.011 ms/op [Average]
[info]   (min, avg, max) = (0.076, 0.083, 0.102), stdev = 0.007
[info]   CI (99.9%): [0.072, 0.094] (assumes normal distribution)
[info] # JMH version: 1.21
[info] # VM version: JDK 1.8.0_181, Java HotSpot(TM) 64-Bit Server VM, 25.181-b13
[info] # VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/bin/java
[info] # VM options: <none>
[info] # Warmup: 3 iterations, 10 s each
[info] # Measurement: 10 iterations, 10 s each
[info] # Timeout: 10 min per iteration
[info] # Threads: 1 thread, will synchronize iterations
[info] # Benchmark mode: Average time, time/op
[info] # Benchmark: com.zocdoc.search.benchmarks.ShuffleBenchmarkTests.moderateOperations
[info] # Run progress: 33.33% complete, ETA 00:04:21
[info] # Fork: 1 of 1
[info] # Warmup Iteration   1: 0.134 ms/op
[info] # Warmup Iteration   2: 0.132 ms/op
[info] # Warmup Iteration   3: 0.127 ms/op
[info] Iteration   1: 0.120 ms/op
[info] Iteration   2: 0.127 ms/op
[info] Iteration   3: 0.129 ms/op
[info] Iteration   4: 0.124 ms/op
[success] Total time:[info] Iteration   5: 0.127 ms/op
[info] Iteration   6: 0.119 ms/op
[info] Iteration   7: 0.133 ms/op
[info] Iteration   8: 0.120 ms/op
[info] Iteration   9: 0.119 ms/op
[info] Iteration  10: 0.119 ms/op
[info] Result "com.zocdoc.search.benchmarks.ShuffleBenchmarkTests.moderateOperations":
[info]   0.124 ±(99.9%) 0.008 ms/op [Average]
[info]   (min, avg, max) = (0.119, 0.124, 0.133), stdev = 0.005
[info]   CI (99.9%): [0.116, 0.131] (assumes normal distribution)
[info] # JMH version: 1.21
[info] # VM version: JDK 1.8.0_181, Java HotSpot(TM) 64-Bit Server VM, 25.181-b13
[info] # VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/bin/java
[info] # VM options: <none>
[info] # Warmup: 3 iterations, 10 s each
[info] # Measurement: 10 iterations, 10 s each
[info] # Timeout: 10 min per iteration
[info] # Threads: 1 thread, will synchronize iterations
[info] # Benchmark mode: Average time, time/op
[info] # Benchmark: com.zocdoc.search.benchmarks.ShuffleBenchmarkTests.simpleOperations
[info] # Run progress: 66.67% complete, ETA 00:02:11
[info] # Fork: 1 of 1
[info] # Warmup Iteration   1: 0.049 ms/op
[info] # Warmup Iteration   2: 0.047 ms/op
[info] # Warmup Iteration   3: 0.047 ms/op
[info] Iteration   1: 0.047 ms/op
[info] Iteration   2: 0.046 ms/op
[info] Iteration   3: 0.045 ms/op
[info] Iteration   4: 0.047 ms/op
[info] Iteration   5: 0.065 ms/op
[info] Iteration   6: 0.050 ms/op
[info] Iteration   7: 0.053 ms/op
[info] Iteration   8: 0.050 ms/op
[info] Iteration   9: 0.051 ms/op
[info] Iteration  10: 0.048 ms/op
[info] Result "com.zocdoc.search.benchmarks.ShuffleBenchmarkTests.simpleOperations":
[info]   0.050 ±(99.9%) 0.009 ms/op [Average]
[info]   (min, avg, max) = (0.045, 0.050, 0.065), stdev = 0.006
[info]   CI (99.9%): [0.042, 0.059] (assumes normal distribution)
[info] # Run complete. Total time: 00:06:34
[info] REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
[info] why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
[info] experiments, perform baseline and negative tests that provide experimental control, make sure
[info] the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
[info] Do not assume the numbers tell you what you want them to tell.
[info] Benchmark                                 Mode  Cnt  Score   Error  Units
[info] ShuffleBenchmarkTests.fullOperations      avgt   10  0.083 ± 0.011  ms/op
[info] ShuffleBenchmarkTests.moderateOperations  avgt   10  0.124 ± 0.008  ms/op
[info] ShuffleBenchmarkTests.simpleOperations    avgt   10  0.050 ± 0.009  ms/op
[success] Total time: 401 s (06:41), completed Nov 1, 2019 7:37:17 AM
```

### Case 2. 3000 providers (w/ 10% same scores)
```
[info] Compiling 7 Java sources to /Users/sheon.han/zd/benchmark-test/target/scala-2.12/classes ...
[info] running (fork) org.openjdk.jmh.Main -i 10 -wi 3 -f 1 -t 1
[info] # JMH version: 1.21
[info] # VM version: JDK 1.8.0_181, Java HotSpot(TM) 64-Bit Server VM, 25.181-b13
[info] # VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/bin/java
[info] # VM options: <none>
[info] # Warmup: 3 iterations, 10 s each
[info] # Measurement: 10 iterations, 10 s eachal 0s
[info] # Timeout: 10 min per iteration
[info] # Threads: 1 thread, will synchronize iterations
[info] # Benchmark mode: Average time, time/op
[info] # Benchmark: com.zocdoc.search.benchmarks.ShuffleBenchmarkTests.fullOperations
[info] # Run progress: 0.00% complete, ETA 00:06:30
[info] # Fork: 1 of 1
[info] # Warmup Iteration   1: 1.423 ms/op
[info] # Warmup Iteration   2: 1.297 ms/op
[info] # Warmup Iteration   3: 1.280 ms/op
[info] Iteration   1: 1.437 ms/op
[info] Iteration   2: 1.356 ms/op
[info] Iteration   3: 1.329 ms/op
[info] Iteration   4: 1.234 ms/op
[info] Iteration   5: 1.288 ms/op
[info] Iteration   6: 1.339 ms/op
[info] Iteration   7: 1.469 ms/op
[info] Iteration   8: 1.468 ms/op
[info] Iteration   9: 1.367 ms/op
[info] Iteration  10: 1.277 ms/op
[info] Result "com.zocdoc.search.benchmarks.ShuffleBenchmarkTests.fullOperations":
[info]   1.356 ±(99.9%) 0.122 ms/op [Average]
[info]   (min, avg, max) = (1.234, 1.356, 1.469), stdev = 0.081
[info]   CI (99.9%): [1.234, 1.478] (assumes normal distribution)
[info] # JMH version: 1.21
[info] # VM version: JDK 1.8.0_181, Java HotSpot(TM) 64-Bit Server VM, 25.181-b13
[info] # VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/bin/java
[info] # VM options: <none>
[info] # Warmup: 3 iterations, 10 s each
[info] # Measurement: 10 iterations, 10 s each
[info] # Timeout: 10 min per iteration
[info] # Threads: 1 thread, will synchronize iterations
[info] # Benchmark mode: Average time, time/op
[info] # Benchmark: com.zocdoc.search.benchmarks.ShuffleBenchmarkTests.moderateOperations
[info] # Run progress: 33.33% complete, ETA 00:04:21
[info] # Fork: 1 of 1
[info] # Warmup Iteration   1: 1.685 ms/op
[info] # Warmup Iteration   2: 1.607 ms/op
[info] # Warmup Iteration   3: 1.548 ms/op
[info] Iteration   1: 1.558 ms/op
[info] Iteration   2: 1.674 ms/op
[info] Iteration   3: 1.641 ms/op
[info] Iteration   4: 1.784 ms/op
[info] Iteration   5: 1.775 ms/op
[info] Iteration   6: 1.632 ms/op
[info] Iteration   7: 1.885 ms/op
[info] Iteration   8: 2.037 ms/op
[info] Iteration   9: 1.735 ms/op
[info] Iteration  10: 1.832 ms/op
[info] Result "com.zocdoc.search.benchmarks.ShuffleBenchmarkTests.moderateOperations":
[info]   1.755 ±(99.9%) 0.212 ms/op [Average]
[info]   (min, avg, max) = (1.558, 1.755, 2.037), stdev = 0.140
[info]   CI (99.9%): [1.543, 1.968] (assumes normal distribution)
[info] # JMH version: 1.21
[info] # VM version: JDK 1.8.0_181, Java HotSpot(TM) 64-Bit Server VM, 25.181-b13
[info] # VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/bin/java
[info] # VM options: <none>
[info] # Warmup: 3 iterations, 10 s each
[info] # Measurement: 10 iterations, 10 s each
[info] # Timeout: 10 min per iteration
[info] # Threads: 1 thread, will synchronize iterations
[info] # Benchmark mode: Average time, time/op
[info] # Benchmark: com.zocdoc.search.benchmarks.ShuffleBenchmarkTests.simpleOperations
[info] # Run progress: 66.67% complete, ETA 00:02:11
[info] # Fork: 1 of 1
[info] # Warmup Iteration   1: 0.650 ms/op
[info] # Warmup Iteration   2: 0.635 ms/op
[info] # Warmup Iteration   3: 0.625 ms/op
[info] Iteration   1: 0.623 ms/op
[info] Iteration   2: 0.634 ms/op
[info] Iteration   3: 0.625 ms/op
[info] Iteration   4: 0.624 ms/op
[info] Iteration   5: 0.622 ms/op
[info] Iteration   6: 0.623 ms/op
[info] Iteration   7: 0.648 ms/op
[info] Iteration   8: 0.664 ms/op
[info] Iteration   9: 0.659 ms/op
[info] Iteration  10: 0.658 ms/op
[info] Result "com.zocdoc.search.benchmarks.ShuffleBenchmarkTests.simpleOperations":
[info]   0.638 ±(99.9%) 0.026 ms/op [Average]
[info]   (min, avg, max) = (0.622, 0.638, 0.664), stdev = 0.017
[info]   CI (99.9%): [0.612, 0.664] (assumes normal distribution)
[info] # Run complete. Total time: 00:06:34
[info] REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
[info] why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
[info] experiments, perform baseline and negative tests that provide experimental control, make sure
[info] the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
[info] Do not assume the numbers tell you what you want them to tell.
[info] Benchmark                                 Mode  Cnt  Score   Error  Units
[info] ShuffleBenchmarkTests.fullOperations      avgt   10  1.356 ± 0.122  ms/op
[info] ShuffleBenchmarkTests.moderateOperations  avgt   10  1.755 ± 0.212  ms/op
[info] ShuffleBenchmarkTests.simpleOperations    avgt   10  0.638 ± 0.026  ms/op
[success] Total time: 402 s (06:42), completed Nov 1, 2019 7:46:05 AM
```

### Case 3. 30000 providers (w/ 10% same scores)
```
[info] Compiling 7 Java sources to /Users/sheon.han/zd/benchmark-test/target/scala-2.12/classes ...
[info] running (fork) org.openjdk.jmh.Main -i 10 -wi 3 -f 1 -t 1
[info] # JMH version: 1.21
[info] # VM version: JDK 1.8.0_181, Java HotSpot(TM) 64-Bit Server VM, 25.181-b13
[info] # VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/bin/java
[info] # VM options: <none>
[info] # Warmup: 3 iterations, 10 s eachremental 1s
[info] # Measurement: 10 iterations, 10 s each
[info] # Timeout: 10 min per iteration
[info] # Threads: 1 thread, will synchronize iterations
[info] # Benchmark mode: Average time, time/op
[info] # Benchmark: com.zocdoc.search.benchmarks.ShuffleBenchmarkTests.fullOperations
[info] # Run progress: 0.00% complete, ETA 00:06:30
[info] # Fork: 1 of 1
[info] # Warmup Iteration   1: 38.486 ms/op
[info] # Warmup Iteration   2: 28.620 ms/op
[info] # Warmup Iteration   3: 26.374 ms/op
[info] Iteration   1: 27.726 ms/op
[info] Iteration   2: 26.643 ms/op
[info] Iteration   3: 26.422 ms/op
[info] Iteration   4: 26.805 ms/op
[info] Iteration   5: 27.993 ms/op
[info] Iteration   6: 26.713 ms/op
[info] Iteration   7: 27.210 ms/op
[info] Iteration   8: 28.300 ms/op
[info] Iteration   9: 26.405 ms/op
[info] Iteration  10: 26.010 ms/op
[info] Result "com.zocdoc.search.benchmarks.ShuffleBenchmarkTests.fullOperations":
[info]   27.023 ±(99.9%) 1.145 ms/op [Average]
[info]   (min, avg, max) = (26.010, 27.023, 28.300), stdev = 0.757
[info]   CI (99.9%): [25.878, 28.167] (assumes normal distribution)
[info] # JMH version: 1.21
[info] # VM version: JDK 1.8.0_181, Java HotSpot(TM) 64-Bit Server VM, 25.181-b13
[info] # VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/bin/java
[info] # VM options: <none>
[info] # Warmup: 3 iterations, 10 s each
[info] # Measurement: 10 iterations, 10 s each
[info] # Timeout: 10 min per iteration
[info] # Threads: 1 thread, will synchronize iterations
[info] # Benchmark mode: Average time, time/op
[info] # Benchmark: com.zocdoc.search.benchmarks.ShuffleBenchmarkTests.moderateOperations
[info] # Run progress: 33.33% complete, ETA 00:04:22
[info] # Fork: 1 of 1
[info] # Warmup Iteration   1: 30.136 ms/op
[info] # Warmup Iteration   2: 27.524 ms/op
[info] # Warmup Iteration   3: 26.769 ms/op
[info] Iteration   1: 26.997 ms/op
[info] Iteration   2: 27.771 ms/op
[info] Iteration   3: 28.378 ms/op
[info] Iteration   4: 29.566 ms/op
[info] Iteration   5: 28.530 ms/op
[info] Iteration   6: 31.979 ms/op
[info] Iteration   7: 28.387 ms/op
[info] Iteration   8: 30.593 ms/op
[info] Iteration   9: 28.206 ms/op
[info] Iteration  10: 28.424 ms/op
[info] Result "com.zocdoc.search.benchmarks.ShuffleBenchmarkTests.moderateOperations":
[info]   28.883 ±(99.9%) 2.201 ms/op [Average]
[info]   (min, avg, max) = (26.997, 28.883, 31.979), stdev = 1.455
[info]   CI (99.9%): [26.683, 31.084] (assumes normal distribution)
[info] # JMH version: 1.21
[info] # VM version: JDK 1.8.0_181, Java HotSpot(TM) 64-Bit Server VM, 25.181-b13
[info] # VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre/bin/java
[info] # VM options: <none>
[info] # Warmup: 3 iterations, 10 s each
[info] # Measurement: 10 iterations, 10 s each
[info] # Timeout: 10 min per iteration
[info] # Threads: 1 thread, will synchronize iterations
[info] # Benchmark mode: Average time, time/op
[info] # Benchmark: com.zocdoc.search.benchmarks.ShuffleBenchmarkTests.simpleOperations
[info] # Run progress: 66.67% complete, ETA 00:02:11
[info] # Fork: 1 of 1
[info] # Warmup Iteration   1: 11.922 ms/op
[info] # Warmup Iteration   2: 10.579 ms/op
[info] # Warmup Iteration   3: 10.541 ms/op
[info] Iteration   1: 11.519 ms/op
[info] Iteration   2: 11.459 ms/op
[info] Iteration   3: 11.551 ms/op
[info] Iteration   4: 11.601 ms/op
[info] Iteration   5: 11.861 ms/op
[info] Iteration   6: 11.152 ms/op
[info] Iteration   7: 9.966 ms/op
[info] Iteration   8: 10.003 ms/op
[info] Iteration   9: 10.454 ms/op
[info] Iteration  10: 10.388 ms/op
[info] Result "com.zocdoc.search.benchmarks.ShuffleBenchmarkTests.simpleOperations":
[info]   10.995 ±(99.9%) 1.086 ms/op [Average]
[info]   (min, avg, max) = (9.966, 10.995, 11.861), stdev = 0.718
[info]   CI (99.9%): [9.909, 12.082] (assumes normal distribution)
[info] # Run complete. Total time: 00:06:34
[info] REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
[info] why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
[info] experiments, perform baseline and negative tests that provide experimental control, make sure
[info] the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
[info] Do not assume the numbers tell you what you want them to tell.
[info] Benchmark                                 Mode  Cnt   Score   Error  Units
[info] ShuffleBenchmarkTests.fullOperations      avgt   10  27.023 ± 1.145  ms/op
[info] ShuffleBenchmarkTests.moderateOperations  avgt   10  28.883 ± 2.201  ms/op
[info] ShuffleBenchmarkTests.simpleOperations    avgt   10  10.995 ± 1.086  ms/op
[success] Total time: 402 s (06:42), completed Nov 1, 2019 7:53:19 AM
```

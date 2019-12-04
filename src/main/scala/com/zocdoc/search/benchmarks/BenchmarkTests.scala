package com.zocdoc.search.benchmarks

import java.util.concurrent.TimeUnit

import org.openjdk.jmh.annotations._
import org.scalatest.{FlatSpec, Matchers}

import scala.util.Random

@BenchmarkMode(Array(Mode.AverageTime))
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Benchmark)
class BenchmarkTests extends FlatSpec with Matchers {


  val numRows = 170000
  val numFeatures = 350

  val data: Array[Array[Double]] = Array.ofDim[Double](numRows, numFeatures + 2)
  println("Allocated array")

  val random = new Random(42L)

  for (i <- data.indices) {
    data(i)(0) = Math.floor(i / 10)
    data(i)(1) = if (i % 10 == 0) 1 else 0
    for (j <- 2 until numFeatures + 2) {
      data(i)(j) = random.nextDouble()
    }
  }

  @Benchmark
  def reduce(): Array[Double] = {
    val finalMean = Array.ofDim[Double](numFeatures)

    for (i <- finalMean.indices) {
      finalMean(i) = data.foldLeft(0d)((a: Double, b: Array[Double]) => a + b(i)) / data.length
    }

    finalMean
  }

  @Benchmark
  def mapApply(): Array[Double] = {
    val finalMean = Array.ofDim[Double](numFeatures)

    for (i <- finalMean.indices) {
      finalMean(i) = data.map(_.apply(i)).sum / data.length
    }

    finalMean
  }

  @Benchmark
  def nativeLoop_ColumnsFirst(): Array[Double] = {
    val finalMean = Array.ofDim[Double](numFeatures)

    for (i <- finalMean.indices) {
      var sum = 0d
      for (j <- data.indices) {
        sum += data(j)(i)
      }

      finalMean(i) = sum / data.length
    }

    finalMean
  }

  @Benchmark
  def nativeLoop_RowsFirst(): Array[Double] = {
    val finalMean = Array.ofDim[Double](numFeatures)

    for (j <- data.indices) {
      for (i <- finalMean.indices) {
        finalMean(i) += data(j)(i)
      }
    }

    for (i <- finalMean.indices) {
      finalMean(i) /= data.length
    }

    finalMean
  }

  "avg calc" should "all work" in {
    val first = nativeLoop_RowsFirst()
    val second = nativeLoop_ColumnsFirst()
    val third = mapApply()
    val fouth = reduce()

    first shouldEqual second
    second shouldEqual third
    third shouldEqual fouth
  }
}

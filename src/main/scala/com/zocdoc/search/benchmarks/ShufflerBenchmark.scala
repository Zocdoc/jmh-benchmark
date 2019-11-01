package com.zocdoc.search.benchmarks

import java.util.concurrent.TimeUnit

import org.openjdk.jmh.annotations._

import scala.util.Random

@BenchmarkMode(Array(Mode.AverageTime))
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Benchmark)
class ShuffleBenchmarkTests {
  // Create 300 providers where 10% of the providers have the same score
  val random = new Random(0L)
  val scores: Seq[Double] = (Seq.range(0, 27000) ++ Seq.range(0, 27000, 900)).map(_.toDouble)
  val shuffledScores: Seq[Double] = Random.shuffle(scores)
  val results: Seq[ProvLocResult] = (shuffledScores).zipWithIndex map {
    case (score, index) => ProvLocResult(s"pr_${index + 1}", score)
  }

  @Benchmark
  def fullOperations: Seq[ProvLocResult] = fullOperationsImpl(results, random)

  def fullOperationsImpl(provLocResults: Seq[ProvLocResult], random: Random): Seq[ProvLocResult] = {
    val groupedProvidersByScore = provLocResults.groupBy(_.score)
    val groupedProvidersWithSameScore = groupedProvidersByScore.filter(group => group._2.length > 1)

    val shuffledProviders = groupedProvidersWithSameScore map {
      case (score, provLocs) => (score, random.shuffle(provLocs))
    }

    val shuffledGroups = groupedProvidersByScore ++ shuffledProviders
    val finalResults = shuffledGroups
      .toSeq
      .sortBy(_._1)
      .reverse
      .flatMap(_._2)
    finalResults
  }

  @Benchmark
  def moderateOperations: Seq[ProvLocResult] = moderateOperationsImpl(results, random)

  private def moderateOperationsImpl(results: Seq[ProvLocResult], random: Random): Seq[ProvLocResult] = {
    val groupedProvidersByScore = results.groupBy(_.score)
    val shuffledProviders = groupedProvidersByScore map {
      case (score, provLocs) => (score, random.shuffle(provLocs))
    }
    shuffledProviders
      .toSeq
      .flatMap(_._2)
  }

  @Benchmark
  def simpleOperations: Seq[ProvLocResult] = simpleOperationsImpl(results, random)

  private def simpleOperationsImpl(results: Seq[ProvLocResult], random: Random): Seq[ProvLocResult] = {
    results.sortBy(pl => (pl.score, random.nextInt()))
  }
}

case class ProvLocResult(id: String, score: Double)

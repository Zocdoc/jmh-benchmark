enablePlugins(JmhPlugin)

name := "benchmark"

organization := "com.zocdoc"
version := "1.0.0"

scalaVersion := "2.12.6"

//addCommandAlias("benchmark", s"jmh:run -rf json -t 2 -wi 5 -i 5")

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.0"
)

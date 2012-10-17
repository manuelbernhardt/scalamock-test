import scala._
import sbt._
import ScalaMockPlugin._
import sbt.Keys._

object ScalamocktestBuild extends Build {

  lazy val scalamocktest = Project(
    id = "scalamocktest",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "scalamocktest",
      organization := "org.foo",
      version := "0.1-SNAPSHOT",
      resolvers += "Delving Snapshot Repository" at "http://development.delving.org:8081/nexus/content/repositories/snapshots",
      resolvers += "Sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
      resolvers += "Sonatype releases" at "https://oss.sonatype.org/content/repositories/releases/",
      libraryDependencies += "org.scalamock" %% "scalamock-specs2-support" % "2.4",
      libraryDependencies += "eu.delving" % "sip-core" % "1.0.14-SNAPSHOT",
      autoCompilerPlugins := true,
      addCompilerPlugin("org.scalamock" %% "scalamock-compiler-plugin" % "2.4")
    )
  ).settings(generateMocksSettings: _*).configs(Mock)
}

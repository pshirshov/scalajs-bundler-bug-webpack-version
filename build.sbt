import scalajsbundler.util.JSON._

enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)

name := "scalajs-tutorial"
scalaVersion := "2.12.6"

// This is an application with a main method
scalaJSUseMainModuleInitializer := true

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.6"
libraryDependencies += "org.querki" %%% "jquery-facade" % "1.2"

skip in packageJSDependencies := false
npmDependencies in Compile += "jquery" -> "2.2.1"

requireJsDomEnv := true

// uTest settings
libraryDependencies += "com.lihaoyi" %%% "utest" % "0.6.3" % "test"
testFrameworks += new TestFramework("utest.runner.Framework")

additionalNpmConfig in Compile := Map("name" -> str(name.value))

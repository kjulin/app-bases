import _root_.sbtassembly.AssemblyPlugin.autoImport._

name := "finch-api"

version := "1.0"

scalaVersion := "2.11.7"

resolvers += "twttr" at "https://maven.twttr.com/"

libraryDependencies ++= Seq(
  "com.github.finagle" %% "finch-core" % "0.9.1",
  "com.github.finagle" %% "finch-jackson" % "0.9.1",
  "com.twitter" %% "twitter-server" % "1.15.0",
  "ch.qos.logback" % "logback-classic" % "1.1.3"
)

mainClass in assembly := Some("Server")

assemblyJarName in assembly := "appname.jar"

test in assembly := {}

target in assembly := file("target/")
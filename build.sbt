organization := "com.greatdreams.example"

name := """hello-guice"""

version := "1.0"

scalaVersion := "2.11.8"

val guiceVersion = "4.1.0"
val slf4jVersion = "1.7.21"
val log4jVersion = "2.6.2"
// Change this to another test framework if you prefer
libraryDependencies ++= Seq(

  "com.google.inject" % "guice" % guiceVersion,

  "org.slf4j" % "slf4j-api" % slf4jVersion,
  "org.slf4j" % "log4j-over-slf4j" % slf4jVersion,
  "org.apache.logging.log4j"% "log4j-slf4j-impl" % log4jVersion,
  "org.apache.logging.log4j"% "log4j-api" % log4jVersion,
  "org.apache.logging.log4j" % "log4j-core" % log4jVersion,

  "org.scalatest" %% "scalatest" % "2.2.6" % "test"
)

// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"


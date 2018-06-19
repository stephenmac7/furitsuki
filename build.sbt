val jcore = "com.stephenmac7" % "jcore_2.12" % "0.1-SNAPSHOT"

lazy val commonSettings = Seq(
  organization := "com.stephenmac7",
  version := "SNAPSHOT",
  scalaVersion := "2.12.6",
  publishMavenStyle := true
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "furitsuki",
    libraryDependencies ++= Seq(jcore),
    scalacOptions ++= Seq(
      "-deprecation",
      "-encoding", "UTF-8",
      "-feature",
      "-Yrangepos"
    )
  )

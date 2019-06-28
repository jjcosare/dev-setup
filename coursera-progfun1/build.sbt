
lazy val `progfun1` = project.in(file("."))
  .aggregate(`w1-example` ,`w1-recfun` ,`w2-funsets` ,`w3-objsets` ,`w4-patmat` ,`w6-forcomp`)
  .settings(scalaVersion := "2.11.12")

lazy val dependencies = Def.setting(Seq("org.scalatest" %% "scalatest" % "2.2.4"))

lazy val `w1-example` = project.settings(libraryDependencies ++= dependencies.value)

lazy val `w1-recfun` = project.settings(libraryDependencies ++= dependencies.value)

lazy val `w2-funsets` = project.settings(libraryDependencies ++= dependencies.value)

lazy val `w3-objsets` = project.settings(libraryDependencies ++= dependencies.value)

lazy val `w4-patmat` = project.settings(libraryDependencies ++= dependencies.value)

lazy val `w6-forcomp` = project.settings(libraryDependencies ++= dependencies.value)

lazy val `progfun1` = project.in(file("."))
  .aggregate(`w1-example` ,`w1-recfun` ,`w2-funsets` ,`w3-objsets` ,`w4-patmat` ,`w6-forcomp`)
  .settings(scalaVersion := "2.11.12")

lazy val `w1-example` = project

lazy val `w1-recfun` = project

lazy val `w2-funsets` = project

lazy val `w3-objsets` = project

lazy val `w4-patmat` = project

lazy val `w6-forcomp` = project

name := """Simple Template"""

version := "1.0.0"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"

// Dependencies
libraryDependencies ++= Seq(
  ws,
  "com.google.inject" % "guice" % "4.1.0",
  "com.ejisan" %% "play-pagemeta" % "1.2.1",
  "com.ejisan" %% "play-form" % "3.0.2",
  "com.ejisan" %% "play-i18n-js" % "1.0.0-SNAPSHOT",
  "com.ejisan" %% "play-i18n-url" % "1.0.0-SNAPSHOT",
  "org.typelevel" %% "cats" % "0.9.0",
  "com.typesafe.slick" %% "slick" % "3.1.1",
  "com.typesafe.play" %% "play-slick" % "2.0.0",
  "com.typesafe.play" %% "play-mailer" % "5.0.0",
  "com.typesafe.play" %% "play-slick-evolutions" % "2.0.0",
  "org.postgresql" % "postgresql" % "42.0.0",
  "com.github.tminglei" %% "slick-pg" % "0.14.6",
  "com.github.tminglei" %% "slick-pg_date2" % "0.14.6",
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test
)

// Web Jars Dependencies
libraryDependencies ++= Seq(
  "org.webjars" % "riot" % "2.6.5",
  "org.webjars" % "bootstrap" % "4.1.1",
  "org.webjars" % "webjars-play_2.11" % "2.5.0",
  "org.webjars" % "jquery" % "2.2.2",
  "org.webjars" % "foundation" % "6.2.0",
  "org.webjars.bower" % "lodash" % "4.16.4",
  "org.webjars.bower" % "compass-mixins" % "1.0.2"
)
dependencyOverrides += "org.webjars" % "jquery" % "2.2.2"
ivyScala := ivyScala.value map { _.copy(overrideScalaVersion = true) }

// Resolvers
resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"
resolvers += "Ejisan Github" at "https://ejisan.github.io/repo/"

// Twirl importing classes
TwirlKeys.templateImports += "ejisan.play.libs.PageMeta"

// Sass compiler options
sassOptions in Assets ++= Seq("--compass", "-r", "compass")
sassOptions in Assets ++= Seq("--cache-location", "target/web/sass/.sass-cache")

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

// Scala compiler options
scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  "-feature",
  "-optimise",
  "-explaintypes",
  "-encoding",
  "UTF-8",
  "-Xlint"
)

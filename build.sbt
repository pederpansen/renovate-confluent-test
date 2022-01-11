scalaVersion := "2.13.8"

resolvers += DefaultMavenRepository
resolvers += "Confluent Maven Repo" at "https://packages.confluent.io/maven/"

libraryDependencies ++= {

  val confluentVersion = "6.0.2"

  Seq(
    "io.confluent"                % "kafka-avro-serializer"    % confluentVersion,
    "io.confluent"                % "kafka-streams-avro-serde" % confluentVersion,
  )
}

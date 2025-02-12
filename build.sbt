scalaVersion := "2.13.7"

resolvers += DefaultMavenRepository
resolvers += "Confluent Maven Repo" at "https://packages.confluent.io/maven/"

libraryDependencies ++= {

  val confluentVersion = "7.8.1"

  Seq(
    "io.confluent"                % "kafka-avro-serializer"    % confluentVersion,
    "io.confluent"                % "kafka-streams-avro-serde" % confluentVersion,
  )
}

# renovate-confluent-test

Minimal repo for reproducing Renovate bot issue with Confluent Maven repo, see https://github.com/renovatebot/renovate/issues/13344

# Expected vs actual behavior

Renovate bot should find the following updates:

- kafka-avro-serializer: 6.0.2 -> 7.0.1
- kafka-streams-avro-serde: 6.0.2 -> 7.0.1

However, no updates are found. There seems to be an issue with this specific Maven repository: https://packages.confluent.io/maven/

# Relevant Logs from Renovate Bot


```
DEBUG: Looking up org.scala-lang:scala-library in repository https://repo.maven.apache.org/maven2/
DEBUG: Found 194 new releases for org.scala-lang:scala-library in repository https://repo.maven.apache.org/maven2/
DEBUG: Looking up org.scala-lang:scala-library in repository https://packages.confluent.io/maven/
DEBUG: No versions found for io.confluent:kafka-avro-serializer in 2 repositories
DEBUG: No versions found for io.confluent:kafka-streams-avro-serde in 2 repositories
DEBUG: Failed to look up dependency io.confluent:kafka-avro-serializer (io.confluent:kafka-avro-serializer)(packageFile="build.sbt", dependency="io.confluent:kafka-avro-serializer")
DEBUG: Failed to look up dependency io.confluent:kafka-streams-avro-serde (io.confluent:kafka-streams-avro-serde)(packageFile="build.sbt", dependency="io.confluent:kafka-streams-avro-serde")
DEBUG: Content is not found for Maven url
{
  "url": "https://packages.confluent.io/maven/org/scala-lang/scala-library/maven-metadata.xml"
}
DEBUG: Package releases lookups complete
{
  "baseBranch": "master"
}
DEBUG: branchifyUpgrades
DEBUG: 1 flattened updates found: scala
DEBUG: Returning 1 branch(es)
DEBUG: Fetching changelog: https://github.com/scala/scala (2.13.7 -> 2.13.8)
DEBUG: config.repoIsOnboarded=true
DEBUG: packageFiles with updates
{
  "config": {
    "sbt": [
      {
        "packageFile": "build.sbt",
        "deps": [
          {
            "registryUrls": [
              "https://repo.maven.apache.org/maven2",
              "https://packages.confluent.io/maven/"
            ],
            "datasource": "maven",
            "depName": "scala",
            "lookupName": "org.scala-lang:scala-library",
            "currentValue": "2.13.7",
            "separateMinorPatch": true,
            "depIndex": 0,
            "warnings": [],
            "versioning": "ivy",
            "sourceUrl": "https://github.com/scala/scala",
            "homepage": "https://www.scala-lang.org/",
            "currentVersion": "2.13.7",
            "isSingleVersion": true,
            "fixedVersion": "2.13.7",
            "updates": [
              {
                "bucket": "latest",
                "newVersion": "2.13.8",
                "newValue": "2.13.8",
                "releaseTimestamp": "2022-01-10T18:02:28.000Z",
                "newMajor": 2,
                "newMinor": 13,
                "updateType": "patch",
                "branchName": "renovate/scala-2.13.x"
              }
            ]
          },
          {
            "registryUrls": [
              "https://repo.maven.apache.org/maven2",
              "https://packages.confluent.io/maven/"
            ],
            "depName": "io.confluent:kafka-avro-serializer",
            "lookupName": "io.confluent:kafka-avro-serializer",
            "currentValue": "6.0.2",
            "groupName": "confluentVersion for io.confluent",
            "datasource": "sbt-package",
            "depIndex": 1,
            "warnings": [
              {
                "topic": "io.confluent:kafka-avro-serializer",
                "message": "Failed to look up dependency io.confluent:kafka-avro-serializer"
              }
            ],
            "versioning": "ivy",
            "updates": []
          },
          {
            "registryUrls": [
              "https://repo.maven.apache.org/maven2",
              "https://packages.confluent.io/maven/"
            ],
            "depName": "io.confluent:kafka-streams-avro-serde",
            "lookupName": "io.confluent:kafka-streams-avro-serde",
            "currentValue": "6.0.2",
            "groupName": "confluentVersion for io.confluent",
            "datasource": "sbt-package",
            "depIndex": 2,
            "warnings": [
              {
                "topic": "io.confluent:kafka-streams-avro-serde",
                "message": "Failed to look up dependency io.confluent:kafka-streams-avro-serde"
              }
            ],
            "versioning": "ivy",
            "updates": []
          }
        ]
      }
    ]
  }
}
```

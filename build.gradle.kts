plugins {
    `java-library`
    id("xyz.jpenilla.run-paper") version "2.3.1" // Paper server for testing/hotloading JVM
}

group = "net.mvndicraft"
version = "0.0.1"
description = ""
java.sourceCompatibility = JavaVersion.VERSION_21
var mainMinecraftVersion = "1.21.11"


repositories {
    mavenLocal()
    mavenCentral()

    // Paper
    maven("https://repo.papermc.io/repository/maven-public/")
    maven("https://repo.aikar.co/content/groups/aikar/")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:$mainMinecraftVersion-R0.1-SNAPSHOT")
}

tasks {
    processResources {
        val props = mapOf(
            "name" to project.name,
            "version" to project.version,
            "description" to project.description,
            "apiVersion" to "$mainMinecraftVersion"
        )
        inputs.properties(props)
        filesMatching("paper-plugin.yml") {
            expand(props)
        }
    }

    runServer {
        minecraftVersion("$mainMinecraftVersion")
    }
}
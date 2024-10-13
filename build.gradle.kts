plugins {
    id("java-library")
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "org.allaymc.javaplugintemplate"
description = "Java plugin template for allay server"
version = "1.0.0"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

repositories {
    mavenCentral()
    maven("https://jitpack.io/")
    maven("https://repo.opencollab.dev/maven-releases/")
    maven("https://repo.opencollab.dev/maven-snapshots/")
    maven("https://storehouse.okaeri.eu/repository/maven-public/")
}

dependencies {
    compileOnly(group = "org.allaymc.allay", name = "api", version = "master-SNAPSHOT")
    compileOnly(group = "org.projectlombok", name = "lombok", version = "1.18.34")

    annotationProcessor(group = "org.projectlombok", name = "lombok", version = "1.18.34")
}

tasks.shadowJar {
    archiveClassifier = "shaded"
}
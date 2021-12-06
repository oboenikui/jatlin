plugins {
    kotlin("jvm") version "1.6.0"
    java
}

group = "com.oboenikui.java-coroutines"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
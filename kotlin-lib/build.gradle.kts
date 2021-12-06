plugins {
    kotlin("jvm")
    `java-library`
}

group = "com.oboenikui.java-coroutines"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(files("$projectDir/libs/java-lib-1.0-SNAPSHOT.jar"))
    implementation(kotlin("stdlib", "1.6.0"))
    val coroutinesVersion = "1.5.2-native-mt"
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-jdk8:$coroutinesVersion")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
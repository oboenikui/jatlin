plugins {
    `java-library`
}

group = "com.oboenikui.java-coroutines"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.6.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

/*
 implementation(project(":java-lib")) や、Jarタスクの出力先を変更する場合は
 IDEA上でエラーとなるため、copyタスクを別途作成する
 */
tasks.register<Copy>("copyJar") {
    dependsOn(tasks.withType(Jar::class))
    from(layout.buildDirectory.dir("libs"))
    include("*.jar")
    into("${project(":kotlin-lib").projectDir}/libs")
}
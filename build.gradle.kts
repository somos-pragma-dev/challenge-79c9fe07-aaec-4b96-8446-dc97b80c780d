plugins {
    kotlin("jvm") version "1.9.20"
    id("io.ktor.plugin") version "2.3.10"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-core:2.3.10")
    implementation("io.ktor:ktor-server-netty:2.3.10")
    implementation("org.jetbrains.exposed:exposed-core:0.39.2")
    implementation("org.jetbrains.exposed:exposed-dao:0.39.2")
    implementation("org.jetbrains.exposed:exposed-jdbc:0.39.2")
    implementation("io.ktor:ktor-auth-jwt:2.3.10")
    testImplementation("io.ktor:ktor-server-tests:2.3.10")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.9.20")
}

ktor {
    fatJar {}
}
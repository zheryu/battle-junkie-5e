plugins {
    // Apply the java plugin to add support for Java
    java

    // Apply the application plugin to add support for building a CLI application.
    application

    // Apply support for JavaFX
    id("org.openjfx.javafxplugin") version "0.0.8"
    id("org.springframework.boot") version "2.3.4.RELEASE"
    id("io.spring.dependency-management") version "1.0.10.RELEASE"
}

repositories {
    // Use jcenter for resolving dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
    mavenCentral()
}

dependencies {
    // Spring
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
    implementation("org.springframework.boot:spring-boot-starter:2.3.4.RELEASE")


    // Guava
    implementation("com.google.guava:guava:29.0-jre")


    // Test
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.6.2")
}

application {
    // Define the main class for the application.
    mainClassName = "io.zheryc.App"
}

tasks.test {
    // Use junit platform for unit tests
    useJUnitPlatform()
}

javafx {
    version = "14"
    modules = listOf("javafx.controls", "javafx.fxml")
}

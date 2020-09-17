plugins {
    // Apply the java plugin to add support for Java
    java

    // Apply the application plugin to add support for building a CLI application.
    application

    // Apply support for JavaFX
    id("org.openjfx.javafxplugin") version "0.0.8"
}

repositories {
    // Use jcenter for resolving dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
}

dependencies {
    // This dependency is used by the application.
    implementation("com.google.guava:guava:29.0-jre")

    // Use JUnit Jupiter API for testing.
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.2")

    // Use JUnit Jupiter Engine for testing.
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.6.2")
}

application {
    // Define the main class for the application.
    mainClassName = "App"
}

tasks.test {
    // Use junit platform for unit tests
    useJUnitPlatform()
}

javafx {
    version = "14"
    modules = listOf("javafx.controls", "javafx.fxml")
}

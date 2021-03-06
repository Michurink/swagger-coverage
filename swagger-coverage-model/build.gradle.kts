plugins {
    java
    `java-library`
}

description = "Swagger Coverage Model"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.swagger:swagger-models")
    implementation("com.fasterxml.jackson.core:jackson-core")
    implementation("com.fasterxml.jackson.core:jackson-databind")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
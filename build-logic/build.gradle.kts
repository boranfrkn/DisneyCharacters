plugins {
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation(libs.gradle)
    implementation(libs.gradlePlugin)
}

tasks.test {
    useJUnitPlatform()
}
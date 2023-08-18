package com.furkanboran.build_logic

import org.gradle.api.Project
import org.gradle.api.artifacts.MinimalExternalModuleDependency
import org.gradle.api.artifacts.VersionCatalog
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.api.provider.Provider
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType

private val Project.libs
    get(): VersionCatalog = extensions.getByType<VersionCatalogsExtension>().named("libs")

private fun Project.findLibrary(libName: String): Provider<MinimalExternalModuleDependency> {
    return libs.findLibrary(libName).get()
}

fun Project.addImplementation(libName: String) {
    dependencies.add("implementation", findLibrary(libName))
}

fun Project.addDebugImplementation(libName: String) {
    dependencies.add("debugImplementation", findLibrary(libName))
}

fun Project.addKaptImplementation(libName: String) {
    dependencies.add("kapt", findLibrary(libName))
}

fun Project.addPlatformImplementation(libName: String) {
    dependencies {
        dependencies.add(
            "implementation",
            platform(findLibrary(libName))
        )
    }
}

pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "DisneyCharacters"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

include(":app")
include(":character-card")
include(":data")
include(":theme")
include(":characters")
include(":core")

pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
        // For resolving the KGP plugin itself, if necessary from here
        maven { url = uri("https://download.jetbrains.com/kotlin/native/builds") }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS) // This is key
    repositories {
        google()
        mavenCentral()
        // Repository for Kotlin Native prebuilt compilers
        maven {
            name = "KotlinNativeCompilerRepository"
            url = uri("https://download.jetbrains.com/kotlin/native/builds")
        }
    }
}

rootProject.name = "EarningsTracker3"
include(":app", ":shared")
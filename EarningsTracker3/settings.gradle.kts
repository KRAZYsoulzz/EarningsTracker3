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
        maven { url = uri("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/native") } // Added here too
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
        // Added new repository for Kotlin Native
        maven {
            name = "KotlinNativeCompilerRepositorySpace"
            url = uri("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/native")
        }
    }
}

rootProject.name = "EarningsTracker3"
include(":app", ":shared")
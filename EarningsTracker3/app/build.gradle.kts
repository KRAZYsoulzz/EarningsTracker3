plugins {
    id("com.android.application")
    kotlin("android")
    id("org.jetbrains.compose") // Jetpack Compose plugin
    // If you use Room or other annotation processors that need KSP:
    // id("com.google.devtools.ksp")
}

// REMOVED any 'repositories { ... }' block from here.
// Repositories should be defined in settings.gradle.kts

android {
    namespace = "com.example.earningstracker3.seekercompanion" // Namespace for the Android app
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.earningstracker3.seekercompanion" // Unique ID for your app
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false // Set to true for production releases
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.composeCompiler.get() // Reference from TOML
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(project(":shared")) // Dependency on the shared Kotlin module

    // Core Android & Jetpack Compose libraries
    implementation(libs.androidx.core.ktx) // Using version catalog
    implementation(libs.androidx.lifecycle.runtime.ktx) // Using version catalog
    implementation(libs.androidx.activity.compose) // Using version catalog

    implementation(platform(libs.androidx.compose.bom)) // Using version catalog
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.compose.material.iconsExtended) // Using version catalog

    // ViewModel & Navigation
    implementation(libs.androidx.lifecycle.viewmodel.ktx) // Using version catalog
    implementation(libs.androidx.lifecycle.viewmodel.compose) // Using version catalog
    implementation(libs.androidx.lifecycle.runtime.compose) // Using version catalog
    implementation(libs.androidx.navigation.compose) // Using version catalog

    // Database: Room (add these when we implement the database)
    // val room_version = "2.6.1" // Or reference from TOML if defined
    // implementation("androidx.room:room-runtime:$room_version")
    // ksp("androidx.room:room-compiler:$room_version")
    // implementation("androidx.room:room-ktx:$room_version")

    // Preferences DataStore (add when needed)
    // implementation("androidx.datastore:datastore-preferences:1.1.1") // Or reference from TOML

    // Testing libraries
    testImplementation(libs.junit) // Using version catalog
    androidTestImplementation(libs.androidx.test.ext.junit) // Using version catalog
    androidTestImplementation(libs.androidx.espresso.core) // Using version catalog
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    debugImplementation(libs.androidx.compose.ui.tooling)
    debugImplementation(libs.androidx.compose.ui.test.manifest)
}

plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.kotlinAndorid)
    alias(libs.plugins.hilt)
    id("hilt-convention")
}

android {
    namespace = "boranfrkn.disneycharacters"
    compileSdk = 34

    defaultConfig {
        applicationId = "boranfrkn.disneycharacters"
        minSdk = 24
        targetSdk = 34
        versionCode = 2
        versionName = "1.1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
}

dependencies {
    implementation(projects.characters)
}
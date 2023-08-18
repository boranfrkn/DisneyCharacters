plugins {
    id("library-convention")
    id("compose-convention")
    id("hilt-convention")
    alias(libs.plugins.kotlinAndorid)
    alias(libs.plugins.hilt)
}

android {
    namespace = "boranfrkn.disneycharacters.characters"

    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.4"
    }
}

dependencies {
    implementation(libs.coreKtx)
    implementation(libs.lifecycleRuntimeKtx)
    implementation(libs.activityCompose)
    implementation(libs.paging)
    debugImplementation(libs.uiTestManifest)

    implementation(projects.characterCard)
    implementation(projects.theme)
    implementation(projects.data)
}
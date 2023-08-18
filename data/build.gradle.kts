plugins {
    id("library-convention")
    id("hilt-convention")
    alias(libs.plugins.kotlinAndorid)
}

android {
    namespace = "boranfrkn.disneycharacters.data"

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {
    implementation(libs.coreKtx)
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.retrofit)
    implementation(libs.retrofitGson)
    implementation(libs.okHttpLogging)
    implementation(libs.paging)

    implementation(projects.core)
}
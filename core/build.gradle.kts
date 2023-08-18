plugins {
    id("library-convention")
    id("hilt-convention")
}

android {
    namespace = "boranfrkn.disneycharacters.core"

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
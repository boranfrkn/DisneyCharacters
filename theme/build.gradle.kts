plugins {
    id("library-convention")
    id("compose-convention")
    alias(libs.plugins.kotlinAndorid)
}

android {
    namespace = "boranfrkn.disneycharacters.theme"
}

dependencies {
    implementation(libs.coreKtx)
}
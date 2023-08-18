import com.furkanboran.build_logic.libs

plugins {
    id("library-convention")
}

android {
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.4"
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
}

dependencies {
    add("implementation", platform(libs.findLibrary("composeBom").get()))
    add("implementation", libs.findLibrary("ui").get())
    add("implementation", libs.findLibrary("uiGraphics").get())
    add("implementation", libs.findLibrary("uiToolingPreview").get())
    add("implementation", libs.findLibrary("material3").get())
    add("debugImplementation", libs.findLibrary("uiTooling").get())
}

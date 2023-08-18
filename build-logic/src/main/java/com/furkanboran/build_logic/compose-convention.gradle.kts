import com.furkanboran.build_logic.addDebugImplementation
import com.furkanboran.build_logic.addImplementation
import com.furkanboran.build_logic.addPlatformImplementation

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
    addPlatformImplementation("composeBom")
    addImplementation("ui")
    addImplementation("uiGraphics")
    addImplementation("uiToolingPreview")
    addImplementation("material3")
    addDebugImplementation("uiTooling")
}

import com.furkanboran.build_logic.libs

plugins {
    kotlin("kapt")
}

dependencies {
    add("implementation", libs.findLibrary("hiltAndroid").get())
    add("kapt", libs.findLibrary("hiltCompiler").get())
}
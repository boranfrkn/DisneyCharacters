import com.furkanboran.build_logic.addImplementation
import com.furkanboran.build_logic.addKaptImplementation

plugins {
    kotlin("kapt")
}

dependencies {
    addImplementation("hiltAndroid")
    addKaptImplementation("hiltCompiler")
}
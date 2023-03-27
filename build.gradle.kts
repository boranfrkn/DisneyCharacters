// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication).apply(false)
    alias(libs.plugins.kotlinAndorid).apply(false)
    alias(libs.plugins.comAndroidLibrary).apply(false)
    alias(libs.plugins.hilt).apply(false)
    alias(libs.plugins.kapt).apply(false)
}
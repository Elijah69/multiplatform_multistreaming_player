plugins {
    id("org.jetbrains.compose") version "1.0.0-alpha4-build348"
    id("com.android.application")
    kotlin("android")
}

group = "test.project"
version = "1.0"

repositories {
    jcenter()
}

dependencies {
    implementation(project(":common:ui:desktopAndAndroid"))
    implementation("androidx.activity:activity-compose:1.3.0")
}

android {
    compileSdkVersion(30)
    defaultConfig {
        applicationId = "test.project.android"
        minSdkVersion(24)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}
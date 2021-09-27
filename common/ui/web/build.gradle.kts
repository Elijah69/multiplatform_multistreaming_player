plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose") version "1.0.0-alpha4-build348"
}

kotlin {
    js(IR) {
        browser()
        binaries.executable()
    }
    sourceSets {
        val jsMain by getting {
            dependencies {
                api(compose.web.core)
                api(compose.runtime)
            }
        }
    }
}
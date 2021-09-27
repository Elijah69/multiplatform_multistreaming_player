pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
    
}
rootProject.name = "multiplatform_multistreaming_player"


include(":android")
include(":desktop")
include(":web")
include(":common:ui:desktopAndAndroid")
include(":common:ui:web")


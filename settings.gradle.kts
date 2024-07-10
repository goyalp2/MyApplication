pluginManagement {
    repositories {
        google()
        mavenCentral()
        maven { setUrl("https://maven.appspector.com/artifactory/android-sdk") }
        maven { setUrl ("https://jitpack.io") }
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        maven { setUrl("https://maven.appspector.com/artifactory/android-sdk") }
        maven { setUrl ("https://jitpack.io") }
        mavenCentral()
    }
}

rootProject.name = "My Application"
include(":app")

pluginManagement {
    repositories {
        google()
        mavenCentral()
        maven { setUrl("https://maven.appspector.com/artifactory/android-sdk") }
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        maven { setUrl("https://maven.appspector.com/artifactory/android-sdk") }
        mavenCentral()
    }
}

rootProject.name = "My Application"
include(":app")

buildscript {
    dependencies {
        classpath ("com.android.tools.build:gradle:3.4.1")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.31")
        classpath ("androidx.navigation:navigation-safe-args-gradle-plugin:2.7.7")
    }
    repositories {
        google()
    }
}

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.4" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    id ("androidx.navigation.safeargs.kotlin") version "2.4.1" apply false
    id ("org.jetbrains.kotlin.android.extensions") version "1.4.21" apply false
}

buildscript {
    dependencies {
        classpath ("com.android.tools.build:gradle:4.0.2")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.31")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.7.7")
    }
    repositories {
        google()
    }
}

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "7.4.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.22" apply false
    id ("androidx.navigation.safeargs.kotlin") version "2.4.2" apply false
    id ("org.jetbrains.kotlin.android.extensions") version "1.3.0" apply false
}

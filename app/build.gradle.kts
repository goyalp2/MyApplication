plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.kapt")
}

android {
    namespace = "com.example.myapplication"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.myapplication"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    dataBinding.enable = true
}

dependencies {

    implementation ("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.9.20")
    implementation ("androidx.appcompat:appcompat:1.7.0")
    implementation ("androidx.core:core-ktx:1.13.1")
    implementation ("androidx.constraintlayout:constraintlayout:2.1.4")

    implementation ("com.android.support:design:28.0.0")

    implementation ("android.arch.lifecycle:extensions:1.1.1")

    implementation ("androidx.navigation:navigation-fragment-ktx:2.7.7")
    implementation ("androidx.navigation:navigation-ui-ktx:2.7.7")

    implementation ("com.squareup.retrofit2:retrofit:2.3.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.3.0")
    implementation ("com.squareup.retrofit2:adapter-rxjava2:2.3.0")

    implementation ("io.reactivex.rxjava2:rxjava:2.1.1")
    implementation ("io.reactivex.rxjava2:rxandroid:2.1.1")

    implementation ("com.github.bumptech.glide:glide:4.9.0")

    implementation ("com.android.support:palette-v7:28.0.0")

    implementation ("com.google.dagger:dagger:2.28.3")
    implementation ("com.google.dagger:dagger-android-support:2.28.3")
    implementation ("androidx.legacy:legacy-support-v4:1.0.0")
    annotationProcessor ("com.google.dagger:dagger-compiler:2.14.1")
    annotationProcessor ("com.google.dagger:dagger-android-processor:2.14.1")

    testImplementation ("org.mockito:mockito-inline:2.11.0")
    testImplementation ("android.arch.core:core-testing:1.1.1")
    annotationProcessor ("com.google.dagger:dagger-compiler:2.14.1")

    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test:runner:1.6.1")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.1")

    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}
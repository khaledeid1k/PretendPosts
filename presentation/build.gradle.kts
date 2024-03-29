@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.kotlinAndroid)
    alias(libs.plugins.hiltAndroid)
    id("androidx.navigation.safeargs.kotlin")
    id("kotlin-parcelize")
    kotlin("kapt")
}

android {
    namespace = "com.kh.presentation"
    compileSdk =34

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        buildConfig = true
        dataBinding= true
    }
}

dependencies {
    implementation(project(":domain"))
    implementation(libs.core.ktx)

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.navigation)
    implementation(libs.navigationUi)
    implementation(libs.constraintlayout)
    implementation(libs.lottie)

    implementation(libs.viewModel)
    implementation(libs.viewModelEx)
    implementation(libs.viewModelEx)
    implementation(libs.viewModelLifecycle)

    implementation(libs.coroutinesCore)
    implementation (libs.databinding.runtime)

    implementation(libs.hilt)
    kapt(libs.hiltCompiler)
}

kapt {
    correctErrorTypes = true
}
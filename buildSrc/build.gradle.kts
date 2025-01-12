plugins {
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
}

gradlePlugin {
    plugins {
        register("common-binary-plugin") {
            id = "common-binary-plugin"
            implementationClass = "com.stefanus_ayudha.plugins.CommonBinaryPlugin"
        }
    }
}

buildscript {

    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:7.2.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
    }
}

repositories {
    gradlePluginPortal()
    google()
    mavenCentral()
}

/**
 * let gradle define it
 * 'val compileKotlin: KotlinCompile by tasks
 * compileKotlin.kotlinOptions {
 *     languageVersion = "1.3"
 * }'
 **/

dependencies {
    implementation("com.android.tools.build:gradle:7.2.2" )
    implementation("com.android.tools.build:gradle-api:7.2.2")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.6.10")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
}
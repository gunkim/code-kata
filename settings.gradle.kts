pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
    plugins {
        val kotlinVersion: String by settings
        val ktlintVersion: String by settings
        kotlin("jvm") version kotlinVersion
        id("org.jlleitschuh.gradle.ktlint") version ktlintVersion
    }
}

include("lotto")
include("happy-code")
include("rabbit-game")
include("hangman")
include("car-racing")
include("string-calculator")
include("tetris")

rootProject.name = "code-kata"


package io.github.gunkim.rabbit.domain

enum class Direction(
    val value: String,
) {
    LEFT("L"),
    RIGHT("R");

    companion object {
        fun random() = values().random()

        fun ofValue(value: String): Direction {
            return values().first { it.value == value }
        }
    }
}
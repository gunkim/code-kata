package io.github.gunkim.data

import io.github.gunkim.domain.Word
import io.github.gunkim.domain.Words

class FileReadWords(
    private val fileName: String,
) : Words {
    override fun findRandom(): Word {
        val words = bufferedReader().readLines().map(Word.Companion::of)
        return words.random()
    }
    private fun bufferedReader() = ClassLoader.getSystemClassLoader().getResourceAsStream(fileName).reader().buffered()
}
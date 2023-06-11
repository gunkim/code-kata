package io.github.gunkim

fun quickSort(array: IntArray): IntArray {
    if (array.size <= 1) {
        return array
    }

    val pivot = array[array.size / 2]
    val smaller = array.filter { it < pivot }.toIntArray()
    val greater = array.filter { it > pivot }.toIntArray()

    return quickSort(smaller) + intArrayOf(pivot) + quickSort(greater)
}

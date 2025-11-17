package lessons.lessons20.homework

fun IntArray.firstLast(): Pair<Int?, Int?> {
    return if (isEmpty()) {
        null to null
    } else {
        first() to last()
    }
}

package lessons.lessons20.homework

fun <T : Comparable<T>> MutableList<T>.toSortedImmutable(ascending: Boolean): List<T> {
    if (ascending) {
        sort()
    } else {
        sortDescending()
    }
    return toList()
}
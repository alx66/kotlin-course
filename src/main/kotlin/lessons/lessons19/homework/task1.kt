package lessons.lessons19.homework

fun <T> getMiddleElement(list: List<T>): T? {
    val size = list.size
    return if (size % 2 == 1) {
        list[size / 2]
    } else {
        null
    }
}
package lessons.lessons19.homework

class ListHolder<T> {
    private val elements: MutableList<T> = mutableListOf()

    fun add(element: T) {
        elements.add(element)
    }

    fun getAll(): List<T> = elements.toList()
}
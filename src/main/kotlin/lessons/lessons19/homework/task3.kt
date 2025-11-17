package lessons.lessons19.homework

interface Mapper<From, To> {
    fun map(item: From): To
    fun mapList(items: List<From>): List<To>
}
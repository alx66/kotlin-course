package lessons.lessons19.homework

interface Validator<T> {
    fun validate(item: T): Boolean
}
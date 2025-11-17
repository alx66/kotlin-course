package lessons.lessons19.homework

class ListValidator<T : Number> : Validator<List<T?>> {
    override fun validate(item: List<T?>): Boolean {
        return item.all { element ->
            element != null && element.toDouble() != 0.0
        }
    }
}
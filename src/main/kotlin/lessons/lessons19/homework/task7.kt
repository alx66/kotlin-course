package lessons.lessons19.homework

class StringValidator : Validator<String?> {
    override fun validate(item: String?): Boolean {
        return !item.isNullOrBlank()
    }
}
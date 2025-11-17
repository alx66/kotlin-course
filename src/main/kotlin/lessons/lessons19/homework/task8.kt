package lessons.lessons19.homework

class OddValidator : Validator<Int> {
    override fun validate(item: Int): Boolean {
        return item % 2 == 0
    }
}
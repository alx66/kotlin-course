package lessons.lessons14.homework

class Party(var location: String, var attendees: Int) {
    fun details() {
        println("Место проведения: $location, количество гостей: $attendees")
    }
}
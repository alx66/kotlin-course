package lessons.lessons14

class Lamp(var shine: Boolean) {

    fun turnOn() = {
        shine = true

    }

    fun turnOff() {
        shine = false
    }

    fun toggle() {
        shine = !shine
        if (shine) {
            println("Включена")
        } else {
            println("Выключена")
        }
    }
}


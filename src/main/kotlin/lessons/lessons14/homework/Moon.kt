package lessons.lessons14.homework

object Moon {
    var  isVisible: Boolean = true
    var phase: String = "Full Moon"

    fun showPhase() {
        if (!isVisible) {
            println("Now $phase")
        } else {
            println("The moon is not visible")
        }
    }
}
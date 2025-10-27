package lessons.lessons14.homework

class Emotion(val type: String, val intensity: Int) {
    fun express() {
        when(type) {
            "злость" -> {
                println("Эмоция $type и...")
                when(intensity) {
                    in 1..3 -> println("вы испытываете легкую злость")
                    in 4..7 -> println("вы испытываете среднюю злость")
                    in 8..10 -> println("вы испытываете сильную злость")
                }
            }
            "грусть" -> {
                println("Эмоция $type и...")
                when(intensity) {
                    in 1..3 -> println("вы испытываете легкую грусть")
                    in 4..7 -> println("вы испытываете среднюю грусть")
                    in 8..10 -> println("вы испытываете сильную грусть")
                }
            }
        }
    }

}
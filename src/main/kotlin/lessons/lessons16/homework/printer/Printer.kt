package lessons.lessons16.homework.printer

abstract class Printer {
    abstract fun print(text: String)
}

class LaserPrinter : Printer() {
    override fun print(text: String) {
        val words = text.split(" ")
        for (word in words) {
            print("\u001B[47m\u001B[30m $word \u001B[0m")
        }
        println()
    }
}

class JetPrinter : Printer() {
    private val colors = listOf(
        "\u001B[41m\u001B[97m",
        "\u001B[42m\u001B[30m",
        "\u001B[43m\u001B[30m",
        "\u001B[44m\u001B[97m",
        "\u001B[45m\u001B[97m",
        "\u001B[46m\u001B[30m"
    )
    private var index = 0

    override fun print(text: String) {
        val words = text.split(" ")
        for (word in words) {
            val color = colors[index % colors.size]
            print("$color $word \u001B[0m")
            index++
        }
        println()
    }
}
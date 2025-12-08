package lessons.lessons24

// 1.
fun processFlag(
    flag: Boolean,
    action: (String) -> Unit
): Int {
    if (flag) {
        action("Флаг включён")
    } else {
        action("Флаг выключен")
    }
    return if (flag) 1 else 0
}

// 2.
fun Int.transformWords(
    transformer: Int.(String) -> List<String>
): List<String> = this.transformer("hello world")

// 3.
inline fun <T, R> T.applyAndReturn(
    transformer: T.() -> R
): R = this.transformer()

// 4.
fun wrapString(input: String): () -> String = { input }

// 5.
fun <T> T.toConstantFunction(): (String) -> T = { this }

// 6.
object Colors {
    const val RESET = "\u001B[0m"
    const val RED = "\u001B[31m"
    const val GREEN = "\u001B[32m"
    const val YELLOW = "\u001B[33m"
    const val BLUE = "\u001B[34m"
    const val PURPLE = "\u001B[35m"
    const val CYAN = "\u001B[36m"
    const val WHITE = "\u001B[37m"
}

fun String.colorize(color: String): String = "$color$this${Colors.RESET}"

fun String.colorizeWords(colorizer: (String) -> String): String {
    return this.split(" ")
        .map { colorizer(it) }
        .joinToString(" ")
}

// -
val colorizeByWordFeatures: (String) -> String = { word ->
    when {
        word.firstOrNull()?.isUpperCase() == true -> word.colorize(Colors.RED)
        word.length < 3 -> word.colorize(Colors.YELLOW)
        word.length > 6 -> word.colorize(Colors.CYAN)
        word.length % 2 == 0 -> word.colorize(Colors.GREEN)
        else -> word.colorize(Colors.WHITE)
    }
}
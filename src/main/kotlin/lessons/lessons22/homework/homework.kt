package lessons.lessons22.homework

// 8-9

fun demonstrateExceptions() {
    try {
        // NullPointerException
        val s: String? = null
        val length = s!!.length
    } catch (e: NullPointerException) {
        println("NullPointerException")
    }

    try {
        // IndexOutOfBoundsException
        val list = listOf(1, 2, 3)
        val outOfBounds = list[10]
    } catch (e: IndexOutOfBoundsException) {
        println("IndexOutOfBoundsException")
    }

    try {
        // ClassCastException
        val any: Any = "hello"
        val number = any as Int
    } catch (e: ClassCastException) {
        println("ClassCastException")
    }

    try {
        // IllegalArgumentException
        if (true) throw IllegalArgumentException("Неверный аргумент")
    } catch (e: IllegalArgumentException) {
        println("IllegalArgumentException")
    }

    try {
        // NumberFormatException
        val invalidNumber = "abc".toInt()
    } catch (e: NumberFormatException) {
        println(" NumberFormatException")
    }

    try {
        // IllegalStateException
        val emptyList = emptyList<Int>()
        val first = emptyList.first()
    } catch (e: IllegalStateException) {
        println("IllegalStateException")
    }

    try {
        // OutOfMemoryError (осторожно: может завершить JVM)
        // val hugeList = List(Int.MAX_VALUE) { "item" }
        // Пропустим в целях безопасности
    } catch (e: OutOfMemoryError) {
        println("OutOfMemoryError")
    }

    try {
        // StackOverflowError
        fun recurse() { recurse() }
        recurse()
    } catch (e: StackOverflowError) {
        println("StackOverflowError")
    }
}

// 10

fun riskyOperation(arg: Any?) {
    try {
        // 1. NullPointerException
        arg.hashCode()

        // 2. IndexOutOfBoundsException
        if (arg is List<*>) {
            arg[100]
        } else {
            listOf(1)[100]
        }

        // 3. ClassCastException
        if (arg != null) {
            val x = arg as Int
        }

        // 4. IllegalArgumentException
        throw IllegalArgumentException("Тест")

        // 5. NumberFormatException
        "abc".toInt()

        // 6. IllegalStateException
        emptyList<Int>().first()

    } catch (t: Throwable) {
        when (t) {
            is NullPointerException -> println("Исключение: NullPointerException")
            is IndexOutOfBoundsException -> println("Исключение: IndexOutOfBoundsException")
            is ClassCastException -> println("Исключение: ClassCastException")
            is IllegalArgumentException -> println("Исключение: IllegalArgumentException")
            is NumberFormatException -> println("Исключение: NumberFormatException")
            is IllegalStateException -> println("Исключение: IllegalStateException")
            else -> println("Неизвестное исключение: ${t::class.simpleName}")
        }
        throw t // повторно выбрасываем
    }

    println("Переданный аргумент фантастически хорош!")
}

// 11

class MyAssertionError(message: String) : AssertionError(message)

// 12

class WrappedIndexError(c: IndexOutOfBoundsException) : RuntimeException("Обёрнутое исключение", c)
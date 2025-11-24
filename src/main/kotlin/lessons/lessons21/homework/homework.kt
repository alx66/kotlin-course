package lessons.lessons21.homework

// 1
fun analyzeDataType(value: Any) {
    when (value) {
        is String -> println("Это строка: $value")
        is Number -> println("Это число: $value")
        is List<*> -> println("Это список, количество элементов: ${value.size}")
        is Map<*, *> -> println("Это словарь, количество пар: ${value.size}")
        else -> println("Неизвестный тип данных")
    }
}

// 2
fun safeCastToList(value: Any): Int {
    val list = value as? List<*>
    return list?.size ?: -1
}

// 3
fun getStringLengthOrZero(value: Any?): Int {
    return (value as? String)?.length ?: 0
}

// 4
fun Any.toSquare(): Double {
    return when (this) {
        is Number -> this.toDouble().let { it * it }
        is String -> this.toDoubleOrNull()?.let { it * it } ?: 0.0
        else -> 0.0
    }
}

// 5
fun sumIntOrDoubleValues(values: List<Any>): Double {
    var sum = 0.0
    for (value in values) {
        when (value) {
            is Int -> sum += value.toDouble()
            is Double -> sum += value
        }
    }
    return sum
}

// 6
fun tryCastToListAndPrint(value: Any) {
    val list = value as? List<*> ?: run {
        println("Ошибка: невозможно привести к списку")
        return
    }

    for (item in list) {
        if (item is String) {
            println(item)
        } else {
            println("Предупреждение: элемент не является строкой ($item)")
        }
    }
}

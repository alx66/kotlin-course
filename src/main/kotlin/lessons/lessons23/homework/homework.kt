package lessons.lessons23.homework

fun main() {
    //  Часть 1: Среднее арифметическое чётных чисел

    // 1. Обычная функция
    fun averageOfEven(numbers: List<Int>): Double {
        require(numbers.isNotEmpty()) { "Список не должен быть пустым" }
        val evens = numbers.filter { it % 2 == 0 }
        return if (evens.isNotEmpty()) evens.average() else 0.0
    }

    // 2. Анонимная функция
    val anonymousAverageOfEven = fun(numbers: List<Int>): Double {
        require(numbers.isNotEmpty()) { "Список не должен быть пустым" }
        val evens = numbers.filter { it % 2 == 0 }
        return if (evens.isNotEmpty()) evens.average() else 0.0
    }

    // 3. Лямбда с указанием типа
    val lambdaWithTypes: (List<Int>) -> Double = { numbers ->
        require(numbers.isNotEmpty()) { "Список не должен быть пустым" }
        val evens = numbers.filter { it % 2 == 0 }
        if (evens.isNotEmpty()) evens.average() else 0.0
    }

    // 4. Лямбда без указания типа
    val lambdaWithoutTypes = { numbers: List<Int> ->
        require(numbers.isNotEmpty()) { "Список не должен быть пустым" }
        val evens = numbers.filter { it % 2 == 0 }
        if (evens.isNotEmpty()) evens.average() else 0.0
    }


    // Часть 2: Сумма цифр числа

    // 1. Обычная функция
    fun sumOfDigits(number: Long): Int {
        require(number > 0) { "Число должно быть больше нуля" }
        return number.toString().sumOf { it.digitToInt() }
    }

    // 2. Анонимная функция
    val anonymousSumOfDigits = fun(number: Long): Int {
        require(number > 0) { "Число должно быть больше нуля" }
        return number.toString().sumOf { it.digitToInt() }
    }

    // 3. Лямбда с указанием типа
    val lambdaSumDigitsWithTypes: (Long) -> Int = { number ->
        require(number > 0) { "Число должно быть больше нуля" }
        number.toString().sumOf { it.digitToInt() }
    }

    // 4. Лямбда без указания типа
    val lambdaSumDigitsWithoutTypes = { number: Long ->
        require(number > 0) { "Число должно быть больше нуля" }
        number.toString().sumOf { it.digitToInt() }
    }



    //  Часть 3: Нахождение дубликатов

    // 1. Функция-расширение
    fun List<Int>.findDuplicates(): Set<Int> {
        val seen = mutableSetOf<Int>()
        val duplicates = mutableSetOf<Int>()
        for (num in this) {
            if (!seen.add(num)) {
                duplicates.add(num)
            }
        }
        return duplicates
    }

    // 2. Анонимная функция
    val anonymousFindDuplicates = fun(list: List<Int>): Set<Int> {
        val seen = mutableSetOf<Int>()
        val duplicates = mutableSetOf<Int>()
        for (num in list) {
            if (!seen.add(num)) {
                duplicates.add(num)
            }
        }
        return duplicates
    }

    // 3. Лямбда с указанием типа
    val lambdaFindDuplicatesWithTypes: (List<Int>) -> Set<Int> = { list ->
        val seen = mutableSetOf<Int>()
        val duplicates = mutableSetOf<Int>()
        for (num in list) {
            if (!seen.add(num)) {
                duplicates.add(num)
            }
        }
        duplicates
    }
}
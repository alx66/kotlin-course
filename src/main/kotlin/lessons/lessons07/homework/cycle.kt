package lessons.lessons07.homework

fun main() {
    // Прямой диапазон. Числа от 1 до 5
    for (i in 1..5) {
        println(i)
    }

    // Четные числа от 1 до 10
    for (i in 2..10 step 2) {
        println(i)
    }

    // Обратный диапазон
    // Числа от 5 до 1
    for (i in 5 downTo 1) {
        println(i)
    }

    // Числа от 10 до 1, уменьшая на 2
    for (i in 10 downTo 1 step 2) {
        println(i)
    }

    //  С шагом
    // С шагом 2 от 1 до 9
    for (i in 1..9 step 2) {
        println(i)
    }

    // Каждое третье число от 1 до 20
    for (i in 1..20 step 3) {
        println(i)
    }

    // Использование until
    val size = 12
    for (i in 3 until size step 2) {
        println(i)
    }

    // Цикл while
    // Квадраты чисел от 1 до 5
    var a = 1
    while (a <= 5) {
        println(a * a)
        a++
    }

    // Уменьшаем число от 10 до 5
    var b = 10
    while (b >= 5) {
        println(b)
        b--
    }

    // Циклы do while
    // От 5 до 1
    var c = 5
    do {
        println(c)
        c--
    } while (c >= 1)

    // < 10, начиная с 5
    var d = 5
    do {
        println(d)
        d++
    } while (d < 10)

    //break
    // for от 1 до 10, прерываем на 6
    for (i in 1..10) {
        if (i == 6) break
        println(i)
    }

    // бесконечный while, прерываем на 10
    var e = 1
    while (true) {
        if (e > 10) break
        println(e)
        e++
    }

    // continue
    // for от 1 до 10, пропускаем четные
    for (i in 1..10) {
        if (i % 2 == 0) continue
        println(i)
    }

    // while от 1 до 10, пропускаем кратные 3
    var f = 1
    while (f <= 10) {
        if (f % 3 == 0) {
            f++
            continue
        }
        println(f)
        f++
    }
}
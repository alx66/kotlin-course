package lessons.lessons11

fun main() {

}

fun a1() {

}

fun a2(): String {
    return ""
}

fun a3(a: String) {

}

fun a4 (a: Double, b: Double): Double {
    return a + b
}

fun a5(a: String?): Boolean {
return true
}

fun a6(a:Int, b:Int): Int {
    return a + b

}

fun a7(a: Int, b: Int): Int {
    return if (a > b)
        a
    else b
}

fun a8(a: List<Int>) {
    for (i in a) {
        if(i >= 0) {
            println(i)
        } else if(i == 0) {
            println("Тут ноль")
        } else return
    }
}

// Напишите функцию replaceString, которая принимает список строк и искомую строку.
// Функция должна перебрать список и заменить первое вхождение искомой строки на её версию в верхнем регистре,
// после чего завершить выполнение с помощью return без возврата значения.

fun replaceString(a: List<String>, b: String) {
    for(i in a.indices) {
        if(a[i].contains(b)) {
          //  a[i] = a[i].replace(b, b.uppercase())
        }
    }
}

// Создайте функцию findFirstEvenNumber, которая принимает список целых чисел.
// Функция должна выводить каждый номер.
// При нахождении первого чётного числа она должна вывести сообщение "Чётное число найдено"
// и завершить выполнение с помощью return без возврата значения.

fun findFirstEvenNumber(list: List<Int>) {
    for (i in list) {
        println(i)
        if(i % 2 == 0) {
            println("Чётное число найдено")
            return
        }
    }
}





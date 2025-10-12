package lessons.lessons11.homework

import javax.swing.text.StyledEditorKit

// ---Задачи на сигнатуру метода---
// Не принимает аргументов и не возвращает значения.
fun notGetArgumentsAndNotReturnValue() {

}
// Принимает два целых числа и возвращает их сумму.
fun getIntValue(a1: Int, b1:Int) {
     a1 + b1
}
// Принимает строку и ничего не возвращает.
fun getString(a: String) {

}
// Принимает список целых чисел и возвращает среднее значение типа Double.
fun getListInt(a2: List<Int>): Double {
return a2.average()
}
// Принимает nullable строку и возвращает её длину в виде nullable целого числа и доступна только в текущем файле.
private fun getNullString(a3: String?): Int? {
    return a3?.length
}
// Не принимает аргументов и возвращает nullable вещественное число.
fun noArguments(): Double? {
    return noArguments()
}
// Принимает nullable список целых чисел, не возвращает значения и доступна только в текущем файле.
private fun nullIntList(a4: List<Int>?) {

}
// Принимает целое число и возвращает nullable строку.
fun getIntValue(a5: Int): String? {
    return getIntValue(5)
}
// Не принимает аргументов и возвращает список nullable строк.
fun noArgumentsAndReturnListNullString(): List<String>? {
    return noArgumentsAndReturnListNullString()
}
// Принимает nullable строку и nullable целое число и возвращает nullable булево значение.
fun getNullString(a6: String?, b6: Int?): Boolean? {
    return getNullString(null, null)
}


// ---Задачи на написание кода---
// Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
fun multiplyByTwo(value: Int): Int {
    return value * 2
}
// Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.
fun isEven(value1: Int): Boolean {
    return value1 % 2 == 0
}
// Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n.
// Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
fun printNumbersUntil(n: Int) {
    if (n < 1) return
    for (i in 1..n) {
        println(i)
    }
}
// Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в списке.
// Если отрицательных чисел нет, функция должна вернуть null.
fun findFirstNegative(value2: List<Int>): Int? {
    for(i in value2) {
        if (i < 0) {
            println(i)
        }
    }
    return null
}
// Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку и выводить каждую строку.
// Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.
fun processList(value3: List<String?>) {
    for (i in value3) {
        if (i == null) {
            return
        }
        println(i)
    }
}

fun main() {
    println(processList(listOf("Раз", "Два", null, "Три")))
}
package lessons.lessons21

import kotlin.math.absoluteValue

fun main() {
    val obj: Any = "Hello, World!"
    if (obj is String) {
        obj.length // явное преобразование к стринг
        println("Объект является строкой")
    }
    if (obj !is Int) {
        println("Объект не является целым числом")
    }

    val num: Any = 123
    val str: String = num as String // as - принудительное приведение к определенному типу

    val safeStr: String? = num as? String // safeStr будет равно null

    // --- Практичесая часть ---

    val arg: Any = "test"
    println((arg as String).length)
    // println(arg as Int)

    if (arg is String) {
        println("Это строка $arg")
    } else {
        println("Это не строка")
    }
// -----
    println(arg as? String ?: "Это не строка")
// -----
    val arg1: Any = listOf("test2")
   // println(arg1 as List<String>) // приведение к списку строк
    // println((arg1 as List<Int>)[0].absoluteValue)

    /*if (arg1 is List<*>) {
        println(arg1)
    } else {
        println("this is not List")
    }*/

    // -----
/*    if ((arg1 as List<*>).isNotEmpty() && arg1[0] is String) {
        println(arg1[0])
    }*/

    println((arg1 as? List<*>)?.firstOrNull() as? String ?: "Is not String")




}
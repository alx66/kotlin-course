package lessons.lessons22

fun main() {
    // 1
    val test: Int? = null
    test!! // nullpointer

    val list = listOf(1,2,3)
    println(list[5]) //indexbounes

    val test2:Any = 32
    test2 as String //classCastException


    // numberFormatException
}
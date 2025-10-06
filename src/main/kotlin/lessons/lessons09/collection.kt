package lessons.lessons09

fun main12() {
    val a1: Array<Int> = Array(10) { 0 }
    for (i in a1.indices) {
        a1[i] = (i + 1) * 10
    }

    val a2: Array<Int> = Array(10) { 0 }
    for (i in a2.indices)
        a2[i] = a1[i] //перенос первого массива во второй


    val a3: List<Int> = listOf(1, 2, 3)
    val a4: Array<String> = arrayOf("sfsfd", "sdfsdfsd")

    val a5 = mutableListOf<Float>()
    a5.add(1.5F)
    a5.add(1.6F)

    for (i in a5) {
        println(i)
    }

    val a6 = listOf("dsfsf", "sfsfdsf")

}

fun newFunc(list: List<String>) {
    val str = "dsfsf"
    for (i in list) {
        when {
            i == str -> println(true)
            else -> println(false)
        }
    }
}

fun main() {
    val a6 = listOf("dsfsf", "sfsfdsf")
    newFunc(a6)
}
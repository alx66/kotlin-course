package lessons.lessons12

fun main() {

    val numbers = listOf(1, 2, 3, 4, 254, -3)
//
    numbers.forEach {
        it // переменная как i в цикле for
        //element -> // переопредление it
    } // заменяет цикл for
//
    val filter2 = numbers.filter { it > 0 } // фильтрация коллекции
//
    val filterNot = numbers.filterNot { it > 0 } // как filter только наоборот
//
    val filterNotNull = numbers.filterNotNull() // очищает коллекцию от Null
//
    numbers.first { it > 0 } // получаем первый элемент из списка
//
    numbers.last { it > 0 } // получаем последний элемент из коллекции
//
    val setOfNumbers = setOf(3,4,5,6,-5)
    val firstElement = setOfNumbers.first() // получение первого элемента во множестве
    val lastElement = setOfNumbers.last() // получение последнего элемента во множестве
//
    numbers.firstOrNull { it > 0 } // если первого элемента нету, то выводим Null
//
    numbers.getOrElse(10) { - 1} // УТОЧНИТЬ
//
    val mapFunExample = numbers.map { it + 1 } // Преобразование в коллекцию List
    println(mapFunExample)
    //
    val numberSquareMap: Map<Int, Int> = numbers.associate { it to it * it } // создание словаря Map, вызов mapof, ключ это элемент, а значение это элемент в квадрате
    //
    val multiplyList = listOf(
        listOf(1,2,3),
        listOf(4,5,6)
    )
    val flattenList = multiplyList.flatten() // объединение двух коллекций
    println(flattenList)
    //
    val flattenListAfterMapping = multiplyList.flatMap { list ->
        list.map { it * 2 }
    }
    println(flattenListAfterMapping)
    //
    val numberString = numbers.joinToString(separator = " : ") // преобразование в строку
    //
    val sortedNumbers = numbers.sorted() // сортировка меньшего к большому
    println(sortedNumbers)
    //
    numbers.sortedDescending() // сортировка от большому к меньшему
    //
    numbers.isEmpty() // проверяет что коллекция пуста
    //
    numbers.isNotEmpty() // проверяет что коллекция не пуста
    //


    val example = listOf(3,4,5,6,-25,5)

    example.getOrElse(80) { "not" } // если индекса 80 нету то отдаст not

    example.joinToString() // приводим к строке

    example.sum() // сумма всех чисел в коллекции

    example.firstOrNull {it < 0} // возьмем первое отрицательное число в списке

    example.contains(6) // содержит элемент 6

    example.filter { it in 18..30 } // фильтрация по диапазону

    example.filterNotNull() // очищаем от null

    val stringCollection = listOf("Земля", "Венера", "Юпитер")

    stringCollection.map { it.length }

    stringCollection.associate { it to it.reversed() } // создание словаря где элемент это клюс а значение перевернутое значение

    stringCollection.sorted() //

    stringCollection.groupBy { it.first() } // группировка по первой букве элемента 

    example.forEach { println(it * it) }






}
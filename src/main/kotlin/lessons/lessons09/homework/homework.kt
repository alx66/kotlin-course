package lessons.lessons09.homework

fun main() {
    // Работа с массивами Array

    // 1. Массив из 5 целых чисел от 1 до 5
    val arr1 = arrayOf(1, 2, 3, 4, 5)
    println(arr1.joinToString())

    // 2. Пустой массив строк на 10 элементов
    val arr2 = Array(10) { "" }
    println(arr2.joinToString())

    // 3. Массив Double, значения — удвоенный индекс
    val arr3 = Array(5) { i -> i * 2.0 }
    println(arr3.joinToString())

    // 4. Массив Int, значение = индекс * 3
    val arr4 = Array(5) { i -> i * 3 }
    println(arr4.joinToString())

    // 5. Массив из 3 nullable строк
    val arr5 = arrayOf<String?>(null, "Kotlin", "Java")
    println(arr5.joinToString())

    // 6. Копирование массива
    val original = arrayOf(1, 2, 3, 4, 5)
    val copy = Array(original.size) { i -> original[i] }
    println(copy.joinToString())

    // 7. Разность двух массивов
    val a = arrayOf(10, 20, 30)
    val b = arrayOf(1, 2, 3)
    val diff = Array(a.size) { i -> a[i] - b[i] }
    println(diff.joinToString())

    // 8. Найти индекс значения 5 через while
    val arr6 = arrayOf(2, 4, 6, 8)
    var i = 0
    var index = -1
    while (i < arr6.size) {
        if (arr6[i] == 5) {
            index = i
            break
        }
        i++
    }
    println(index)

    // 9. Чётное / нечётное
    val arr7 = arrayOf(1, 2, 3, 4, 5, 6)
    for (num in arr7) {
        val type = if (num % 2 == 0) "чётное" else "нечётное"
        println("$num — $type")
    }

    // 10. Функция поиска подстроки в массиве
    fun findSubstring(arr: Array<String>, query: String) {
        for (item in arr) {
            if (item.contains(query)) {
                println("Найдено: $item")
            }
        }
    }
    findSubstring(arrayOf("Kotlin", "Java", "Ktor"), "tor")



    // Работа со списками List


    // 1. Пустой неизменяемый список Int
    val list1 = listOf<Int>()
    println(list1)

    // 2. Неизменяемый список строк
    val list2 = listOf("Hello", "World", "Kotlin")
    println(list2)

    // 3. Изменяемый список Int от 1 до 5
    val list3 = mutableListOf(1, 2, 3, 4, 5)
    println(list3)

    // 4. Добавить новые элементы
    list3.addAll(listOf(6, 7, 8))
    println(list3)

    // 5. Удалить элемент
    val list4 = mutableListOf("Hello", "World", "Kotlin")
    list4.remove("World")
    println(list4)

    // 6. Вывести элементы списка
    val list5 = listOf(10, 20, 30)
    for (item in list5) println(item)

    // 7. Получить второй элемент
    val list6 = listOf("A", "B", "C")
    println(list6[1])

    // 8. Изменить элемент по индексу
    val list7 = mutableListOf(5, 10, 15, 20)
    list7[2] = 99
    println(list7)

    // 9. Объединить два списка через цикл
    val listA = listOf("One", "Two", "Three")
    val listB = listOf("Four", "Five")
    val merged = mutableListOf<String>()
    for (item in listA) merged.add(item)
    for (item in listB) merged.add(item)
    println(merged)

    // 10. Найти min и max через цикл
    val list8 = listOf(4, 7, 1, 9, 3)
    var min = list8[0]
    var max = list8[0]
    for (n in list8) {
        if (n < min) min = n
        if (n > max) max = n
    }
    println("min=$min, max=$max")

    // 11. Новый список только с чётными
    val list9 = listOf(1, 2, 3, 4, 5, 6)
    val evens = mutableListOf<Int>()
    for (n in list9) if (n % 2 == 0) evens.add(n)
    println(evens)

    // Работа с множествами Set

    // 1. Пустое неизменяемое множество Int
    val set1 = setOf<Int>()
    println(set1)

    // 2. Неизменяемое множество Int
    val set2 = setOf(1, 2, 3)
    println(set2)

    // 3. Изменяемое множество строк
    val set3 = mutableSetOf("Kotlin", "Java", "Scala")
    println(set3)

    // 4. Добавить элементы
    set3.addAll(listOf("Swift", "Go"))
    println(set3)

    // 5. Удалить элемент
    val set4 = mutableSetOf(1, 2, 3, 4)
    set4.remove(2)
    println(set4)

    // 6. Вывести элементы множества
    val set5 = setOf(5, 10, 15)
    for (item in set5) println(item)

    // 7. Проверка наличия строки
    fun containsString(set: Set<String>, target: String): Boolean {
        for (s in set) {
            if (s == target) return true
        }
        return false
    }
    println(containsString(setOf("Kotlin", "Java"), "Java")) // true

    // 8. Конвертация множества в изменяемый список
    val set6 = setOf("A", "B", "C")
    val listFromSet = mutableListOf<String>()
    for (item in set6) listFromSet.add(item)
    println(listFromSet)
}
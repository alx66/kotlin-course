package lessons.lessons10

fun exampleMap() {
    val pair = 1 to 'a'
    val empty = mapOf<String, Int>("Россия" to 1, "Франция" to 2) // неизменяый

    val mutableMap = mutableMapOf<String, String>() // изменяемая
    mutableMap["1"] = "Один" // добавление
    mutableMap.remove("2") //удаление

    for ((country, capital) in empty) {
        println("$country это $capital")
    } // перебор значений в словаре через цикл

    if ("Россия" in empty) {
        println(empty)
    }

}

// practice

fun main() {
// Пустой неизменяемый словарь где ключ строка а значение целые числа и проициниализировать
    val a1 = mapOf<String, Int>("Красный" to 1, "Синий" to 2)
// Изменяемый словарь где ключ и значение это строки
    val a2 = mutableMapOf<String, String>("Russia" to "Moscow", "B" to "b", "X" to "x", "Q" to "q")
    a2["C"] = "c"
    a2.remove("A")
// Цикл который перебирает значения из словаря а1 и выводит значения

    for((color, value) in a1) {
        println("$color под значением $value")
    }
// Вызов функции и перебор значения двумя способами
    mapExample(a2, "Russia") // вызов функции
    if ("Russia" in a2) println(a2["Russia"]) else println("Ключ не найден") // поиск значения не через цикл а через оператор
    a2["Russia"] = "Samara" // заменяем в словаре а2 значение у ключа Russia
// График работы сотрудников: ключи - это дни недели, а значения - списки сотрудников, работающих в каждый день. График составляется на короткий период и не подразумевает изменения.
    val workTime = mapOf<String, MutableList<String>>()
// Учебный план: ключи - это названия предметов, а значения - списки доступных курсов и их описаний.
    val sudyPlan = mapOf<String, MutableList<String>>()
// Контакты в телефонной книге: ключи - это имена контактов, а значения - список данных контакта (например, номер телефона, адрес электронной почты).
val numberBook = mutableMapOf<String, MutableMap<String, String>>()
    numberBook["Иван Гуляш"] = mutableMapOf("Номер телефона" to "8917453454", "Адрес эл. почты" to "test@test.ru")
    numberBook["Иван Гуляш"]?.put("Пол", "Мужской")

}

// Отдельная функция в которую отправляем словарь и ключ из этого словаря и внутри делаем итерацию по этому словарю и
// искать значение по ключу и выводить значение в консоль

fun mapExample(map: Map<String, String>, key: String) {
    for ((k, v) in map) {
        if (key == k) {
            println(v)
            return
        }
        }
    println("Ключ не найден")
    }


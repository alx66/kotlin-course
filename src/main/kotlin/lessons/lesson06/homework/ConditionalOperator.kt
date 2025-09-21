package lessons.lesson06.homework

// Задача 1
    fun chooseSeason(num: Int) {
    when(num) {
        1 -> println("Январь")
        2 -> println("Февраль")
        3 -> println("Март")
        4 -> println("Апрель")
        5 -> println("Май")
        6 -> println("Июнь")
        7 -> println("Июль")
        8 -> println("Август")
        9 -> println("Сентябрь")
        10 -> println("Октябрь")
        11 -> println("Ноябрь")
        12 -> println("Декабрь")
        else -> "Неизвестный месяц"
    }
}


//Задача 2

fun dogPeopleYears(dogAge: Int) {
    val humanAge = 0
    if (dogAge <= 2) {
        dogAge * 10.5
    } else {
        21 + (dogAge - 2) * 4
    }
    println("Возраст собаки $dogAge лет = $humanAge человеческих лет")
}

// Задача 3
fun betterWay(test: Double) {
    when(test) {
        in 0.0..1.0 -> println("пешком")
        in 1.0..5.0 -> println("велосипед")
        else -> println("автотранспорт")
    }
}

//Задача 4
fun getBonus(sum: Double) {
    val onlyHundreds = (sum / 100).toInt()
    val bonus = if (sum <= 1000) {
        onlyHundreds * 2
    } else {
        onlyHundreds * 3
    }
    println("Бонусные баллы: $bonus")
}


// Задача 5

fun getTypeDocument(value: String ) {
    when(value) {
        "txt" -> println("Текстовый документ")
        "png", "jpeg", "jpg" -> println("Изображение")
        "table" -> println("Таблица")
        else -> println("Неизвестный тип")
    }
}

//Задача 6

fun convertTemperature(value: Double, unit: String) {
    when (unit) {
        "C" -> {
            val fahrenheit = value * 9 / 5 + 32
            print(fahrenheit)
            println(" F")
        }
        "F" -> {
            val celsius = (value - 32) * 5 / 9
            print(celsius)
            println(" C")
        }
        else -> println("Некорректная единица измерения")
    }
}

// Задача 7
fun betterClothes(temp: Int) {
    when(temp) {
        in -30..9 -> println("куртка и шапка")
        in 10..18 -> println("ветровка")
        in 19..35 -> println("футболка и шорты")
        else -> println("Сиди дома")


    }

}

//Задача 8
fun betterFilms(age: Int) {
    when(age) {
        in 0..9 -> println("Детские")
        in 10 until 18 -> println("Подростковые")
        else -> println("18+")
    }
}

fun main() {
    betterFilms(9)
}




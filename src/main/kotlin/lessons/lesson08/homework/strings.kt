package lessons.lesson08.homework


// 1. Преобразование строк
fun transformationStrings(arg: String): String {
    val phrase = arg.trim()
    val words = phrase.split(" ")

    val res = when {
        arg.contains("невозможно") -> arg.replace("невозможно", "совершенно точно возможно, просто требует времени")
        arg.startsWith("Я не уверен") -> "$arg, но моя интуиция говорит об обратном"
        arg.contains("катастрофа") -> arg.replace("катастрофа", "интересное событие")
        arg.endsWith("без проблем") -> arg.replace("без проблем", "с парой интересных вызовов на пути")
        words.size == 1 && phrase.isNotEmpty() -> "Иногда, $phrase, но не всегда"

        else -> arg
    }
    return res
}

// 2. Извлечение даты из строки лога. "Пользователь вошел в систему -> 2021-12-01 09:48:23"
fun getDateAndTime() {
    val originalString = "Пользователь вошел в систему -> 2021-12-01 09:48:23"
    val takeDateString = originalString.split("->")[1].trim().split(" ")[0]
    println(takeDateString)
    val takeTimeString = originalString.split("->")[1].trim().split(" ")[1]
    println(takeTimeString)


}

// 3. Маскирование личных данных

fun maskForCardNumber() {
    val fullNumberCard = "4539 1488 0343 6467"
    val numberCardWithMask = fullNumberCard.substring(0, 0) + "****" + fullNumberCard.substring(14)
    println(numberCardWithMask)
}

// 4. Форматирование адреса электронной почты.
fun replaceEmail() {
    val stringEmail = "username@example.com"
    val res = when {
        stringEmail.contains("username@example.com") -> stringEmail.replace(
            "username@example.com",
            "username [at] example [dot] com"
        )

        else -> ""
    }
    println(res)


}

// 5. Извлечение имени файла из пути.

fun getPathFile() {
    val stringPath = "C:/Пользователи/Документы/report.txt"
    val extensionPathFile = stringPath.split("/")
    val res = extensionPathFile[3]
    println(res)

}

// 6. Создание аббревиатуры из фразы.

fun acronym() {
    val acronymFullPharse = "Котлин лучший язык программирования"
    val words = acronymFullPharse.split(" ")
    var countWord = ""

    for(i in words) {
        if (i.isNotEmpty()) {
            countWord += i[0].uppercaseChar()
        }
    }
    println(countWord)

}

fun main() {
    acronym()
}
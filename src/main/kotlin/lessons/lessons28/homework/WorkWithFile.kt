package lessons.lessons28.homework

import java.time.*
import java.time.format.DateTimeFormatter
import java.time.temporal.Temporal


fun main() {
    // 1. Создай текущую метку времени и выведи её на печать (чтобы ещё раз запомнить название этого класса)
    val currentTimestamp = Instant.now()
    println("Текущая метка времени (Instant): $currentTimestamp")

    // 2. Создай дату своего дня рождения.
    val birthDate = LocalDate.of(1985, 3, 15) // Пример: 15 марта 1985

    // 3. Создай период между датой своего рождения и текущей датой. Выведи на печать количество лет из этого периода.
    val currentDate = LocalDate.now()
    val period = Period.between(birthDate, currentDate)
    println("Количество полных лет: ${period.years}")

    // 4. Создай функцию, которая принимает тип Temporal и выводит форматированное значение в зависимости от того,
    // содержит ли аргумент время и часовой пояс.
    fun printTemporalCustom(temporal: Temporal) {
        when (temporal) {
            is LocalDateTime -> println(temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")))
            is ZonedDateTime -> println(temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z")))
            is OffsetDateTime -> println(temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss x")))
            is LocalTime -> println(temporal.format(DateTimeFormatter.ofPattern("HH:mm:ss")))
            is LocalDate -> println(temporal.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")))
            else -> println(temporal.toString())
        }
    }

    fun printTemporalISO(temporal: Temporal) {
        when (temporal) {
            is LocalDateTime -> println(temporal.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME))
            is ZonedDateTime -> println(temporal.format(DateTimeFormatter.ISO_ZONED_DATE_TIME))
            is OffsetDateTime -> println(temporal.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME))
            is LocalTime -> println(temporal.format(DateTimeFormatter.ISO_LOCAL_TIME))
            is LocalDate -> println(temporal.format(DateTimeFormatter.ISO_LOCAL_DATE))
            else -> println(temporal.toString())
        }
    }

    // 5. Создай объекты дат и / или времени которые мы изучили и по очереди передай их в метод созданный выше.
    val localDate = LocalDate.of(2020, 5, 20)
    val localTime = LocalTime.of(14, 30, 45)
    val localDateTime = LocalDateTime.of(2020, 5, 20, 14, 30, 45)
    val zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.systemDefault())
    val offsetDateTime = OffsetDateTime.of(localDateTime, ZoneOffset.ofHours(3))

    println("\nФорматирование через собственную реализацию:")
    printTemporalCustom(localDate)
    printTemporalCustom(localTime)
    printTemporalCustom(localDateTime)
    printTemporalCustom(zonedDateTime)
    printTemporalCustom(offsetDateTime)

    println("\nФорматирование через ISO форматы:")
    printTemporalISO(localDate)
    printTemporalISO(localTime)
    printTemporalISO(localDateTime)
    printTemporalISO(zonedDateTime)
    printTemporalISO(offsetDateTime)

    // 6. Создайте функцию identifyGeneration, которая расширяет класс LocalDate
    LocalDate.of(1950, 6, 10).identifyGeneration() // Бумер
    LocalDate.of(2000, 8, 20).identifyGeneration() // Зумер
    LocalDate.of(1970, 4, 5).identifyGeneration() // Не определено

    // 7. Создай два объекта даты: 25 февраля 2023 года и 25 февраля 2024 года.
    // Создай форматтер, который форматирует дату в месяц и день.
    // Выведи первую отформатированную дату, прибавив к ней 10 дней.
    val date1 = LocalDate.of(2023, 2, 25)
    val date2 = LocalDate.of(2024, 2, 25)

    val formatter = DateTimeFormatter.ofPattern("MMMM dd")
    val resultDate = date1.plusDays(10)
    println("\nОтформатированная дата после прибавления 10 дней: ${resultDate.format(formatter)}")
}

// Расширение для LocalDate
private val boomersStart = LocalDate.of(1946, 1, 1)
private val boomersEnd = LocalDate.of(1964, 12, 31)
private val zoomersStart = LocalDate.of(1997, 1, 1)
private val zoomersEnd = LocalDate.of(2012, 12, 31)

fun LocalDate.identifyGeneration() {
    when {
        this in boomersStart..boomersEnd -> println("Бумер")
        this in zoomersStart..zoomersEnd -> println("Зумер")
        else -> println("Не определено")
    }
}
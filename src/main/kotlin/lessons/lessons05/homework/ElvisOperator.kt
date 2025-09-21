package lessons.lessons05.homework

fun main() {
//Задача 1
    val startBaseValue: Double = 100.0
    val testCoef: Double? = 0.6
    val standartCoefValue: Double = 0.5
    val finallyResult = startBaseValue * (testCoef?: standartCoefValue)

//Задача 2
    val deliveryCost = 100      // Стоимость доставки
    val cargoValue: Int? = null // Стоимость груза (может быть null)

    val finalCargoValue = cargoValue ?: 50
    val insurance = finalCargoValue * 0.005
    val totalCost = deliveryCost + insurance

// Задача 3
    val pressureValue: Double? = 455.5
    val alarmMessage: String = "Data missed"

    val dataValue = pressureValue?: alarmMessage
}
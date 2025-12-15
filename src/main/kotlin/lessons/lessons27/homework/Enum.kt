package lessons.lessons27.homework

import java.lang.IllegalArgumentException

// 1

// Статусы прохождения теста
enum class TestStatus {
    PASSED, BROKEN, FAILED
}

// Типы жилой недвижимости с человекочитаемыми названиями
enum class PropertyType(val displayName: String) {
    APARTMENT("Квартира"),
    HOUSE("Дом"),
    COTTAGE("Коттедж"),
    STUDIO("Студия"),
    DUPLEX("Дуплекс"),
    LOFT("Лофт"),
    TOWNHOUSE("Таунхаус")
}

// Планеты Солнечной системы с расстоянием
enum class Planet(
    val distanceInAU: Double,
    val massInEarthMasses: Double
) {
    MERCURY(0.39, 0.055),
    VENUS(0.72, 0.815),
    EARTH(1.0, 1.0),
    MARS(1.52, 0.107),
    JUPITER(5.20, 317.8),
    SATURN(9.58, 95.2),
    URANUS(19.22, 14.5),
    NEPTUNE(30.05, 17.1);


    // 2
    fun printPropertyTypesByDisplayNameLength() {
        PropertyType.entries
            .sortedBy { it.displayName.length }
            .forEach { println(it.displayName) }
    }

    // 3
    fun runTest(block: () -> Unit): TestStatus = try {
        block()
        TestStatus.PASSED
    } catch (e: AssertionError) {
        TestStatus.FAILED
    } catch (e: Exception) {
        TestStatus.BROKEN
    }

    // 4
    fun findPlanet(filter: (Planet) -> Boolean): Planet {
        return Planet.entries.firstOrNull(filter)
            ?: throw IllegalArgumentException("Ни одна планета не удовлетворяет условию фильтрации")
    }
}


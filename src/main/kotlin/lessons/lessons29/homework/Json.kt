package lessons.lessons29.homework

import com.google.gson.*
import java.io.File
import java.io.FileReader
import java.io.FileWriter

data class Employee(
    val name: String,
    val employed: Boolean,
    val birthDate: String,
    val position: CharacterTypes,
    val subordinates: List<Employee> = emptyList()
)

enum class CharacterTypes {
    CTO,
    UX_UI,
    CRM,
    FRONTEND_DEV,
    TEAM_LEAD,
    BACKEND_DEV,
    PM,
    SYSADMIN,
    QA
}

val gson = GsonBuilder().setPrettyPrinting().create()

fun serializeCTOToFile(cto: Employee, fileName: String = "cto.json") {
    val jsonString = gson.toJson(cto)
    FileWriter(fileName).use { it.write(jsonString) }
    println("CTO сериализован и записан в файл $fileName")
}

fun deserializeCTOFromFile(fileName: String = "cto.json"): Employee? {
    if (!File(fileName).exists()) {
        println("Файл $fileName не найден.")
        return null
    }
    FileReader(fileName).use { reader ->
        val cto = gson.fromJson(reader, Employee::class.java)
        println("CTO десериализован из файла:")
        println(cto)
        return cto
    }
}

fun listAllEmployeesRecursively(employee: Employee): List<Employee> {
    val all = mutableListOf<Employee>()
    all.add(employee)
    employee.subordinates.forEach { subordinate ->
        all.addAll(listAllEmployeesRecursively(subordinate))
    }
    return all
}

fun groupAndPrintEmployeesByPosition(cto: Employee) {
    val allEmployees = listAllEmployeesRecursively(cto)
    val grouped = allEmployees.groupingBy { it.position }.eachCount().keys.associateWith { position ->
        allEmployees.filter { it.position == position }.map { it.name }
    }

    println("\n--- Группировка сотрудников по должности ---")
    grouped.forEach { (position, names) ->
        println("$position: ${names.joinToString(", ")}")
    }
}

fun main() {
    // Задание 2: Создаём объекты рабочей группы
    val frontendDevs = listOf(
        Employee("Анна", true, "1990-05-15", CharacterTypes.FRONTEND_DEV),
        Employee("Иван", true, "1992-08-22", CharacterTypes.FRONTEND_DEV),
        Employee("Ольга", false, "1988-11-10", CharacterTypes.UX_UI)
    )

    val backendDevs = listOf(
        Employee("Дмитрий", true, "1985-03-12", CharacterTypes.BACKEND_DEV),
        Employee("Елена", true, "1991-07-30", CharacterTypes.QA),
        Employee("Сергей", true, "1989-01-20", CharacterTypes.SYSADMIN)
    )

    val frontLead = Employee("Мария", true, "1987-09-05", CharacterTypes.TEAM_LEAD, frontendDevs)
    val backLead = Employee("Алексей", true, "1986-12-01", CharacterTypes.TEAM_LEAD, backendDevs)

    val pm = Employee("Татьяна", true, "1984-04-18", CharacterTypes.PM, listOf(frontLead, backLead))
    val crm = Employee("Петр", true, "1980-10-25", CharacterTypes.CRM)
    val cto = Employee("Владимир", true, "1975-06-30", CharacterTypes.CTO, listOf(pm, crm))

    // Задание 3: Сериализация CTO в файл
    serializeCTOToFile(cto)

    // Задание 4: Десериализация из файла
    val deserializedCto = deserializeCTOFromFile()

    // Задание 5: Группировка и вывод
    if (deserializedCto != null) {
        groupAndPrintEmployeesByPosition(deserializedCto)
    }
}
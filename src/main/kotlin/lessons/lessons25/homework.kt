package lessons.lessons25

// 1.
fun timeTracker(block: () -> List<Int>): Long {
    val start = System.currentTimeMillis()
    block()
    val end = System.currentTimeMillis()
    return end - start
}

// Пример использования:
val myFunction = {
    val list = List(10_000_000) { (0..10_000).random() }
    list.sorted()
}

fun main1() {
    val duration = timeTracker(myFunction)
    println("Функция выполнена за $duration мс")
}


// класс
class Person(val name: String, val age: Int) {
    var email: String = ""
}

class Employee(val name: String, val age: Int, val position: String) {
    var email: String = ""
    var department: String = "General"
}

// 2.
val employee = Employee("Алексей", 30, "Developer").apply {
    email = "alexey@example.com"
    department = "IT"
}

// 3.

fun printPersonInfo(person: Person) {
    with(person) {
        println("Имя: $name")
        println("Возраст: $age")
        println("Email: $email")
        println("---")
    }
}

// 4.
fun main2() {
    val person = Person("Иван", 35)

    val employeeFromPerson = with(person) {
        Employee(name, age, "Manager").apply {
            email = this@with.email
            department = "HR"
        }
    }
}

// 5.
fun main() {
    val person = Person("Елена", 40)
    person.email = "elena@example.com"

    val employeeFromPerson2 = person.run {
        Employee(name, age, "Analyst").apply {
            email = this@run.email
            department = "Finance"
        }
    }
}
// 6.

fun Person?.toEmployee(position: String, department: String = "General"): Employee? {
    return this?.let { person ->
        Employee(person.name, person.age, position).apply {
            email = person.email
            this.department = department
        }
    }
}
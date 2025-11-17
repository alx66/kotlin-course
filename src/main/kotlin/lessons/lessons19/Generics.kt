package lessons.lessons19

class BoxAny(val item: Any)

fun main() {
    val appleBoxAny = BoxAny("Apple")
    val intBoxAny = BoxAny(42)

    val appleBoxAnyItem: Any = appleBoxAny.item // Any вместо строки
    val intBoxAnyItem: Any = intBoxAny.item // Any вместо числа
}
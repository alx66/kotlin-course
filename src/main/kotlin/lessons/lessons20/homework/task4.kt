package lessons.lessons20.homework

import kotlin.math.absoluteValue

fun Number.within(other: Number, deviation: Double): Boolean {
    val diff = this.toDouble() - other.toDouble()
    return diff.absoluteValue <= deviation
}
package lessons.lessons15.homework.furniture

open class Seating(
    material: String,
    color: String,
    weight: Double,
    val numberOfSeats: Int,
    val hasArmrests: Boolean
) : Furniture(material, color, weight)
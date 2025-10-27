package lessons.lessons15.homework.furniture

class Chair(
    material: String,
    color: String,
    weight: Double,
    numberOfSeats: Int,
    hasArmrests: Boolean,
    val hasBackrest: Boolean
) : Seating(material, color, weight, numberOfSeats, hasArmrests)
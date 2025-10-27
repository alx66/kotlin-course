package lessons.lessons15.homework.furniture

class Table(
    material: String,
    color: String,
    weight: Double,
    val tableTopShape: String,
    val hasDrawers: Boolean
) : Furniture(material, color, weight)
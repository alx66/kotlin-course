package lessons.lessons15.homework.geometricshapes

class Quadrilateral(
    color: String,
    typeFigure: String,
    numberOfSides: Int,
    val isParallelogram: Boolean
) : Polygon(color, typeFigure, numberOfSides)
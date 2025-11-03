package lessons.lessons16.homework.shape


abstract class Shape {
    abstract fun area(): Double
}

class Circle(private val radius: Double) : Shape() {
    override fun area(): Double = 3.14 * radius * radius
}

class Square(private val side: Double) : Shape() {
    override fun area(): Double = side * side
}

class Triangle(
    private val a: Double,
    private val b: Double,
    private val angleDegrees: Double
) : Shape() {
    override fun area(): Double {
        val angleRad = Math.toRadians(angleDegrees)
        return 0.5 * a * b * kotlin.math.sin(angleRad)
    }
}
package lessons.lessons14

class Wind(private var speed: Int) {

    fun convertToMetersPerSeconds(): Double {
        return speed / 3.6

    }

    fun setSpeed(speed: Int) {
        if (speed < 0) {
            return
        } else {
            this.speed = speed
        }
    }

    fun print() {
        println(speed)
    }



}
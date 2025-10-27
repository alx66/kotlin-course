package lessons.lessons14

import lessons.lessons14.homework.Concert
import lessons.lessons14.homework.Emotion
import lessons.lessons14.homework.Moon
import lessons.lessons14.homework.Party

fun main() {
    val lamp = Lamp(true)
    lamp.toggle()
    lamp.toggle()


    val wind = Wind(5)
    wind.setSpeed(3)
    wind.print()

    val party = Party("Москва", 30)
    party.details()

    val emotion = Emotion("злость", 9)
    emotion.express()

    Moon.showPhase()

    val concert = Concert("Киш", "КРЦ Звезда", 1000.0, 3)
    concert.infoAboutConcert()
    concert.buyTicket()
    concert.buyTicket()
    concert.buyTicket()
    concert.buyTicket()


}


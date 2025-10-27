package lessons.lessons14.homework

class Concert(val group: String, val place: String, val price: Double, val capacity: Int ) {
    private var ticketsSold = 0
    var availableTickets = capacity

    fun infoAboutConcert() {
    println("Сегодня выступает $group в $place. Цена билетов: $price. Обратите внимание вместимость зала $capacity человек(а)")
    }

    fun buyTicket() {
        if (availableTickets > 0) {
            availableTickets--
            ticketsSold++
            println("Свободных мест: $availableTickets, билетов куплено: $ticketsSold")
        } else {
            println("Билеты закончились")
        }
    }
}
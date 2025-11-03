package lessons.lessons16.homework.cartGoods

class ShoppingCart {
    private val items = mutableMapOf<String, Int>()

    fun addToCart(itemId: String) {
        items[itemId] = items.getOrDefault(itemId, 0) + 1
    }

    fun addToCart(itemId: String, amount: Int) {
        items[itemId] = items.getOrDefault(itemId, 0) + amount
    }

    fun addToCart(itemMap: Map<String, Int>) {
        for ((id, amount) in itemMap) {
            items[id] = items.getOrDefault(id, 0) + amount
        }
    }

    fun addToCart(itemIdList: List<String>) {
        for (id in itemIdList) {
            addToCart(id)
        }
    }

    override fun toString(): String {
        if (items.isEmpty()) return "Корзина пуста."
        val sb = StringBuilder()
        sb.append("ID\t|\tКоличество\n")
        var total = 0
        for ((id, count) in items) {
            sb.append("$id\t|\t$count\n")
            total += count
        }
        sb.append("Всего артикулов: ${items.size}, Общее количество: $total")
        return sb.toString()
    }
}
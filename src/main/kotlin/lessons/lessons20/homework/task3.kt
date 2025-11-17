package lessons.lessons20.homework

fun <K, V> Map<K, List<V>>?.extractByIndex(index: Int): Map<String, V?>? {
    if (this == null) return null

    return this.mapKeys { it.key.toString() }
        .mapValues { (_, list) ->
            if (index in list.indices) list[index] else null
        }
}
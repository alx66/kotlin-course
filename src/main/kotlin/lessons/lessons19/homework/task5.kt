package lessons.lessons19.homework

fun <K, V> transposition(map: Map<K, V>): Map<V, K> {
    return map.entries.associate { it.value to it.key }
}
fun main() {
    val set = createSet()
    val map = createMap("jackie d", set)
    println(map)
}

fun createSet(): MutableSet<String> {
    return mutableSetOf("Catch 22", "Fargo", "Quiet")
}

fun createMap(author: String, set: MutableSet<String>): MutableMap<String, MutableSet<String>> {
    return mutableMapOf(author to set)
}
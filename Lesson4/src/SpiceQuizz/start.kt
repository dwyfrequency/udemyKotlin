package SpiceQuizz

fun main() {
    val spiceGang = SimpleSpice()
    spiceBoy()
}

fun spiceBoy() {
    val spices1 = listOf(
        SimpleSpice("curry", "mild"),
        SimpleSpice("pepper", "medium"),
        SimpleSpice("cayenne", "spicy"),
        SimpleSpice("ginger", "mild"),
        SimpleSpice("red curry", "medium"),
        SimpleSpice("green curry", "mild"),
        SimpleSpice("hot pepper", "extremely spicy")
    )
    val lowerSpice = spices1.filter { it -> it.heat <= 8 }
    for (i in lowerSpice) println("${i.name} : ${i.spiciness}")
}
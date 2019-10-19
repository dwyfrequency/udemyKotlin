package Spices

fun main() {
    genSpiceList()
}

data class SpiceContainer(val spice: Spice) {
    val label = spice.name
}

fun genSpiceList() {
    val spiceList = listOf(SpiceContainer(Curry("Yellow Curry", "mild")),
        SpiceContainer(Curry("Red Curry", "medium")),
        SpiceContainer(Curry("Green Curry", "spicy")))

    for(i in spiceList) println(i.label)
}
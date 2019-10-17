package SpiceQuizz

class SimpleSpice(var name: String = "red", var spiciness: String = "mild") {

    val heat : Int
        get() { return when (spiciness) {
            "extremely spicy" -> 10
            "spicy" -> 8
            "medium" -> 6
            "mild" -> 5
            else -> 0
        }}
    init {
        println("spice named $name created")
    }
}

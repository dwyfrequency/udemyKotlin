package SpiceQuizz

class SimpleSpice(var name: String = "red", var spiciness: String = "mild") {

    private val heat : Int
        get() { return when (spiciness) {
            "very hot" -> 9
            "hot" -> 7
            "mild" -> 5
            else -> 0
        }}
}

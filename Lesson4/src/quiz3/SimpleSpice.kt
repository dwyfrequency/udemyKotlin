package quiz3

class SimpleSpice {
    var name: String = "red"
    var spiciness: String = "mild"
    val heat : Int
        get() { return when (spiciness) {
            "mild" -> 5
            else -> 0
        }}
}

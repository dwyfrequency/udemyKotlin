package Spices

fun main() {
    val curry = Curry("vindalu", "spicy")
    curry.grind()
    curry.color
}

interface Grinder {
    fun grind() {
        println("out here grinding")
    }
}

abstract class Spice (var name: String = "red", var spiciness: String = "mild") {

    val heat : Int
        get() { return when (spiciness) {
            "extremely spicy" -> 10
            "spicy" -> 8
            "medium" -> 6
            "mild" -> 5
            else -> 0
        }}
    abstract fun prepareSpice()

    init {
        println("spice named $name created")
    }
}

class Curry(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor) : Spice(name, spiciness), Grinder, SpiceColor by color {
    override fun prepareSpice() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun grind() {
        super.grind()
    }
}

interface SpiceColor {
    val color: String
}

object YellowSpiceColor : SpiceColor {
    override val color: String
        get() = "yellow"
}

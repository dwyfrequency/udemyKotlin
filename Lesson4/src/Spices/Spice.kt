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

abstract class Spice(val name: String, val spiciness: String = "mild", color: SpiceColor) : SpiceColor by color {
    abstract fun prepareSpice()
}

class Curry(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor) : Spice(name, spiciness, color), Grinder {
    override fun grind() {
        println("we do really be grinding")
    }

    override fun prepareSpice() {
        grind()
    }
}

interface SpiceColor {
    val color: String
}

object YellowSpiceColor : SpiceColor {
    override val color: String
        get() = "yellow"
}

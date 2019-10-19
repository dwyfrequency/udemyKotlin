package aquarius

fun main(args: Array<String>) {
    delegate()
}

fun delegate() {
    val gold = GoldFish()
    println("GoldFish has color ${gold.color}")
    gold.eat()
    val peco = Peco()
    peco.eat()
}

interface FishColor {
    val color: String
}

// composing with mult interfaces
class Peco: FishAction, FishColor by GoldColor {
    override val color: String = "purp"

    override fun eat() {
        println("nom city beach")
    }
}

// using singeton with object
object GoldColor: FishColor {
    override val color: String = "gold"
}
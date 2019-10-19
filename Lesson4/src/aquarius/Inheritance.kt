package aquarius

fun main(args: Array<String>) {
    delegate()
}

fun delegate() {
    val gold = GoldFish()
    println("GoldFish has color ${gold.color}")
    gold.eat()
}
import kotlin.random.Random

fun main(args: Array<String>) {
    println("Hello gang gang")
    tester()
    for (i in 0..13) {println("rollDiceImproved: ${rollDiceImproved(i)}")}

}

val rollDice = { Random.nextInt(12) + 1}
val rollDiceImproved = {numSides: Int ->
    if(numSides == 0) numSides
    else rollDice()
}

fun tester() {
    for (i in 0..12) { println(rollDice()) }
}
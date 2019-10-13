import kotlin.math.pow

fun main() {
//    println("blem")
//    println(totalAquar())
//    var rainbowColor : String? = null
//    println(rainbowColor ?: "Blue")
//
//    val list1: List<String?> = listOf("High", null)
//    val list2: List<String?>? = null
//    println(list1)
//    println(list2)
//
//    var nullTest:Int? = null
//    println(nullTest?.inc() ?: 72.inc())
//
//    printWelcome()
//    templatePract()
//    whenPract()
//    arrayPract()
    arrayLooping()
}

fun arrayLooping() {
    var list3 : MutableList<Int> = mutableListOf()
    for(i in 11..15) list3.add(i)
    print(list3)

    var listStr = list3.map { it -> it.times(3).toDouble() }
    print(listStr)

    var list4: MutableList<Int> = mutableListOf()
    for (i in 0..100 step  10) { list4.add(i) }
    println("list4: $list4")

}

fun arrayPract() {
    val arr = Array(7){1000.0.pow(it)}
    val sizes = arrayOf("byte", "kilobyte", "megabyte", "gigabyte",
        "terabyte", "petabyte", "exabyte")
    for ((i, value) in arr.withIndex()) {
        println("1 ${sizes[i]} = ${value.toLong()} bytes")
    }
}
fun totalAquar(): Int {
    return 2.plus(71).plus(233).minus(13).div(30).plus(1)
}

fun printWelcome() {
    var welcomeMessage = "Hello and welcome to Kotlin"
    when (welcomeMessage.length) {
        0 -> println("Nothing to say?")
        in 1..50 -> println("Perfect")
        else -> println("Too long!")
    }
}

fun templatePract() {
    var trout: String = "yes"
    var haddock: String = "no"
    var snapper: String = "yes"
    println("fish i'll eat trout: $trout, haddock: $haddock, and snapper: ${snapper + "ssss"}")
}

fun whenPract() {
    val fishName = "SuperFish"
    when(fishName.length) {
        0 -> print("error msg")
        in 3..12 -> print("solid name my fish")
        else -> print("blem")

    }
}
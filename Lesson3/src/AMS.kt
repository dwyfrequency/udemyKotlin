import kotlin.random.Random

fun main(args: Array<String>) {
    println("Hello, ${args[0]}")
    feedTheFish()
}

fun shouldChangeWater(day:String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return true
}

fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}

fun feedTheFish() {
    val day = randomDay()
    println(fishFood(day))
    if(shouldChangeWater("Mon")) {
        println("Change the water today")
    }
}

fun randomDay() : String {
    val weekDays = listOf<String>("Mon","Tues","Wed", "Thurs", "Fri", "Sat", "Sun")
    return weekDays[Random.nextInt(7)]
}

fun fishFood (day: String) : String {
    return when(day) {
        "Mon" -> "Blem"
        "Tues" -> "Drake"
        "Wed" -> "Cheeese"
        "Thurs" -> "Bl2"
        "Fri" -> "Forma"
        "Sat" -> "Blo"
        "Sun" -> "Need"
        else  ->  "No food my friend"
    }
}
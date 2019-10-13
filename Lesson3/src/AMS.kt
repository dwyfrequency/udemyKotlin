import kotlin.random.Random

fun main(args: Array<String>) {
    println("Hello, ${args[0]}")
    feedTheFish()
}

fun feedTheFish() {
    val day = randomDay()
    println(fishFood(day))
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
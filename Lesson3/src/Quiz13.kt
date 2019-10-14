import com.sun.org.apache.xpath.internal.operations.Bool

fun main(args: Array<String>) {
    println("Hello!!!!!")
    println(whatShouldIDoToday("happy", "sunny"))
    println(whatShouldIDoToday2("happy", "sunny"))

}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24) : String {
        if(mood == "happy" && weather == "sunny") return "go for a walk"
        return "Stay home and read."

}

fun whatShouldIDoToday2(mood: String, weather: String = "sunny", temperature: Int = 24) : String {
//    omitting the conditional, allows us to write this logic
    return when {
        eval(mood, weather, temperature) -> "stay in bed"
        mood == "happy" && weather == "Sunny" -> "go for a walk"
        tempEval(temperature) -> "go swimming"
        else -> "Stay home and read."
    }
}

fun eval(mood: String, weather: String, temperature: Int): Boolean {
    return mood == "sad" && weather == "rainy" && temperature == 0
}

fun tempEval(temperature: Int): Boolean {
    return temperature > 35
}



fun main(args: Array<String>) {
    println("Hello!!!!!")
    println(whatShouldIDoToday("happy", "sunny"))

}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24) : String {
        if(mood == "happy" && weather == "sunny") return "go for a walk"
        return "Stay home and read."

}



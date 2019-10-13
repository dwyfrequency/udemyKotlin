import java.util.*

fun main(args: Array<String>) {
    println("Hello World ${args[0]}")
    dayOfWeek()
    conditionals()
    caseWhen(args[1])
}

fun dayOfWeek() {
    println("What day is it today? ${
    when (Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) {
        0 -> "Sunday"
        else -> "Def not sunday"
    }
    
    }")
    println(Calendar.getInstance().get(Calendar.DAY_OF_WEEK))
}

fun conditionals() {
    var blem = if ("jack".length > 4) true else false
    println("conditional: $blem")
}

fun caseWhen(hour: String) {
    println(if(hour.toInt() in 12..24) "Good night Kotlin" else "Good morning Kotlin")
}
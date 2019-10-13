import java.util.*

fun main(args: Array<String>) {
    println("Hello World")
    dayOfWeek()
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
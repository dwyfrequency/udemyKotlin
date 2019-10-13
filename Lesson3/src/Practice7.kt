fun main(args: Array<String>) {
    println("Hello from main")
    println(getFortuneCookie())
}

fun getFortuneCookie(): String {
    val arr = listOf<String>("You will have a great day!",
    "Things will go well for you today.",
    "Enjoy a wonderful day of success.",
    "Be humble and all will turn out well.",
    "Today is a good day for exercising restraint.",
    "Take it easy and enjoy life!",
    "Treasure your friends because they are your greatest fortune.")

    print("Enter your birthday: ")
    val birthday = readLine()?.toIntOrNull() ?: 1
    println("bday: $birthday")
    println(arr.count())
    val remainder: Int = birthday % arr.count()
    return arr[remainder]
}
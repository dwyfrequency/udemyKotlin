fun main(args: Array<String>) {
    println("Hello from main")
    println("Your fortune is: ${getFortuneCookie()}")
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
    val birthday = getBirthday()
    val remainder: Int = birthday % arr.count()
    return when(birthday) {
        28, 31 -> "Blmmmmer"
        in 1..7 -> "First week"
        else -> arr[remainder]
    }

}

fun getBirthday(): Int {
    return readLine()?.toIntOrNull() ?: 1
}
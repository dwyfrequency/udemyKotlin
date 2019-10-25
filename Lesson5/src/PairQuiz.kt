fun main() {
    val b = Book()
    val (title, author) = b.getPair()
    println("$title by $author")
    val (t, a, y) = b.getTripple()
    println("$t released by $a on $y")
}

class Book(val title: String = "Cats Cradle", val author: String = "Kurt Von", val year: Int = 1970) {
    fun getPair(): Pair<String, String> {
        return (title to author)
    }

    fun getTripple(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}
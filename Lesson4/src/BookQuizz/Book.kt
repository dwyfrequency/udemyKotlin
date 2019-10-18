package BookQuizz

open class Book(val title: String, val author: String) {
    private var currentPage: Int = 1
    open fun readPage() {
        currentPage++
        println("currentPage: $currentPage")
    }

    open fun printAll() {
        println("title: $title; author: $author ")
    }

    init {
        println("Book() created")
    }
}

class EBook(title: String, author: String, var format: String = "text") : Book(title, author){
    private var wordCount: Int = 250
    override fun readPage() {
        wordCount += 250
        println("new wordCount: $wordCount")
    }

    override fun printAll() {
        println("title: $title; author: $author; format: $format")
    }

    init {
        println("eBook() created")
    }
}


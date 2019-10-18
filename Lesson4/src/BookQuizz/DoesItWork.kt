package BookQuizz

fun main() {
    val book = Book("xtr", "mr. blem")
    book.readPage()
    book.printAll()
    val eBook = EBook("cool", "mr. coll","electronic")
    eBook.readPage()
    eBook.printAll()
}
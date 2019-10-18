package BookQuizz

open class Book(private var currentPage: Int = 1) {
    fun readPage() {
        currentPage++
    }
}

class eBook() : Book() {

}


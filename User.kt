package library

class User(book: Book) {
    var idx: Int
    var book: Book

    init {
        this.idx = getIdx()
        this.book = book
    }

    companion object {
        var bokIdx: Int = 1

        private fun getIdx(): Int {
            return bokIdx ++
        }
    }
}
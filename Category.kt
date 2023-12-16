package library

open class Category(var bookName: String, var description: String, var idx: Int) {
// 위처럼 쓸 경우 아래 생략 가능하다고 함
//    var idx: Int
//    val bookName: String
//    var description: String
//
//    init {
//        this.idx = idx
//        this.bookName = bookName
//        this.description = description
//    }

    fun displayInfo() { // 책 설명 출력
        println("분류번호 : $idx, 도서명: $bookName, 도서분류: $description")
    }

    // 인덱스 값 지정
    companion object {
        private var
    }

}
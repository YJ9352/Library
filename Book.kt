package library

class Book(var bookName: String, var description: String, genre: String): Category(genre) {

    // 책 개별 설명 출력
    // 아래 override 하니까 자동으로 Category의 displayInfo 도 open 이 됨, 장르 때문인듯
    override fun displayInfo() {
        println("도서번호 : ${idenNumber()}, 도서명 : $bookName, 설명 : $description, 장르 : $genre")
    }

    // 전체 도서 분류번호
    companion object {
        var allNum: Int = 1

        // 분류번호 1증가
        private fun idenNumber(): Int {
            return allNum ++
        }
    }
    
}
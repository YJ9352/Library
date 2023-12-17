package library

// 여기서 open을 붙이는 이유 : book에 여기로 넘어울수 있게 해주려고?
open class Category(genre: String) {
    //open class Category(var idx: Int = genBookIdx(), var description: String)
    // 위처럼 쓸 경우 아래 생략 가능하다고 함
    // 그런데 여기에 쓰면 도서 카테고리 정보넣을때 Int 값도 직접 써줘야하는듯
    // 그래서 기본 숫자 지정하고, 이후 자동 증가를 위해서 한꺼번에 안 쓰는걸지도

    var idx: Int
    var genre: String

    init {
        this.idx = genBookIdx()
        this.genre = genre
    }

    // 책 분류 설명 출력
    open fun displayInfo() { 
        println("분류번호 : $idx, 도서분류: $genre")
    }

    // 인덱스 값 지정
    companion object {
        // 기본값을 정하는 곳
        private var bokIdx = 0

        // 값 증가시키는 식
        private fun genBookIdx(): Int {
            bokIdx += 1000
            return bokIdx
        }
        // for 문 안에서 step은 증가값 변경가능, 단 음수는 지원안함
        // ++ 는 1 씩 증가시켜서 어떻게 해도 앞자리 지정이 안됐다
    }
}

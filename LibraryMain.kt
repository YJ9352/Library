package library

val categories: MutableList<Category> = ArrayList() // 카테고리 불러오기
val books: MutableList<Book> = ArrayList() // 책 정보

fun main() {
libraryData()

}

// 숫자 입력
fun selectNum(): Int {
    var inputNum: String?
    var selNum: Int?

    while (true) {
        println("책의 분류번호를 입력해주세요.")
        inputNum = readLine()
        selNum = inputNum?.toIntOrNull()

        if (selNum != null) {
            return selNum
        } else {
            println("올바른 숫자를 입력해주세요.")
        }
    }
}

fun libraryData() {
    // 도서 분류
    categories.add(Category("총류"))
    categories.add(Category("과학"))
    categories.add(Category("문학"))
    categories.add(Category("예술"))
    categories.add(Category("역사"))

    // 과학
    books.add(Book("가장 짧은 우주의 역사", "빅뱅에서부터 생명의 진화, 인간의 역사에 이르기까지", "과학"))
    books.add(Book("호모 데우스", "평화와 번영의 시대가 이렇게 빨리 끝날 거라고는 예상하지 못했다", "과학"))
    books.add(Book("창백한 푸른점", "우리는 여기에 있다", "과학"))

    // 문학
    books.add(Book("나는 왜 불안한가", "내 안의 불안, 제대로 이해하고 다스리는 법", "문학"))
    books.add(Book("카르마 상담소", "삶의 인과를 깊이 이해하면 마음의 고통이 치유된다", "문학"))
    books.add(Book("브런치 하실래요", "출간을 망설이는 예비 작가를 위한 책 쓰기 에세이", "문학"))

    // 예술
    books.add(Book("사울 레이터(Saul Leiter)", "나에게 철학이랄 것은 없다. 카메라가 있을 뿐", "예술"))
    books.add(Book("디즈니 뮤지엄", "디즈니 백과사전 출간!", "예술"))
    books.add(Book("베르너의 색상 명명법", "현대 색상 표준 체계를 세운 세계 최초의 색 명명집", "예술"))

    // 역사
    books.add(Book("러시아는 무엇이 되려 하는가", "자유주의의 황혼, 그리고 러시아의 귀환", "역사"))
    books.add(Book("한글과 타자기", "한글 기계화의 기술, 미학, 역사", "역사"))
    books.add(Book("최소한의 한국사", "5천 년 역사가 단숨에 이해되는 핵심 한국사", "역사"))

    for (i in 0..categories.size - 1) {
        categories[i].displayInfo()
    }

    for (i in 0..books.size - 1) {
        books[i].displayInfo()
    }


}



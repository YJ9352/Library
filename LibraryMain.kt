package library

val categories: MutableList<Category> = ArrayList() // 카테고리 불러오기

fun main() {



}

fun libraryData() { // 여기 해설코드에는 init 이던데 왜 fun이 붙는지 궁금함
    // 도서 분류
    categories.add(Category( "총류"))
    categories.add(Category("사회과학"))
    categories.add(Category("자연과학"))
    categories.add(Category("문학"))
    categories.add(Category("예술"))
    categories.add(Category("역사"))

 //   for(i in 0..categories.size-1) {
 //       categories[i].displayInfo()
 //   }
}



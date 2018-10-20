package Classes

open class Book(var title: String, var autor: String){
    private var currentPage: Int = 1
   open fun readPage(){currentPage.inc()}
}

class ebook(title: String, autor: String, var format: String = "text"):Book(title, autor){
    private var wordsRead: Int = 0
    override fun readPage(){ wordsRead = wordsRead + 250}
}
package kpo.library.pattern

import IncorrectCommandExeption
import kpo.library.RandomGenerator
import kpo.library.model.Library
import kpo.library.model.Book

class Handler(
   private val command: Int?,
   private val library: Library
) {

    fun handler(name: String, author: String) {
        when(command) {
            1 -> {
                val page = RandomGenerator().generateInt()
                val info = RandomGenerator().generateString()
                library.addBook(Book(name, author, page, info))
            }
            2 -> library.deleteBook(name, author)
            3 -> library.viewBook(name, author)
            4 -> library.searchBook(name, author)
            else -> throw IncorrectCommandExeption()
        }
    }
}
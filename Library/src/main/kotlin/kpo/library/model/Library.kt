package kpo.library.model

import NoSuchBookInLibrary
import kpo.library.Actions
import kpo.library.ConverterFile
import kpo.library.pattern.ViewModel

class Library {

    private var books : MutableList<Book> = mutableListOf()

    fun addBook(book : Book) {
        books.add(book)
        ConverterFile(books).changeDataFile()
        ViewModel(Actions.ADD).viewModel("Спасибо за книгу!")
    }

    fun deleteBook(name: String, author: String) {
        if(giveBook(name, author) == null) throw NoSuchBookInLibrary()
        books.remove(books.find{it.name == name && it.author == author})
        ConverterFile(books).changeDataFile()
        ViewModel(Actions.DELETE).viewModel("Только не забудьте вернуть!")
    }

    fun viewBook(name: String, author: String) {
        if(giveBook(name, author) == null) throw NoSuchBookInLibrary()
        ViewModel(Actions.VIEW).viewModel(giveBook(name, author))
    }

    fun searchBook(name: String, author: String) {
        ViewModel(Actions.SEARCH).viewModel(if(giveBook(name, author) == null) false else true)
    }

    private fun giveBook(name: String, author: String): Book? = books.find{
        it.name == name &&
        it.author == author}

}
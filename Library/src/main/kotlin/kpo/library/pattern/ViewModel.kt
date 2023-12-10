package kpo.library.pattern

import kpo.library.Actions
import kpo.library.model.Book

class ViewModel(
    private val model: Actions
) {

    fun viewModel(any: Any?) {
        when(model) {
            Actions.ADD -> println(any.toString())
            Actions.DELETE -> println(any.toString())
            Actions.VIEW -> println(any as Book)
            Actions.SEARCH -> if(any as Boolean) println("У нас есть такая книга")
                                else println("У нас нет такой книги")
        }
    }
}
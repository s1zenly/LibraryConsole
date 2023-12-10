package kpo.library

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.Json.Default.encodeToString
import kpo.library.model.Book
import java.io.BufferedWriter
import java.io.FileWriter

class ConverterFile(
    private val books: MutableList<Book> = mutableListOf()
) {

    private val filePath: String = "books.json"

    fun changeDataFile() {
        createFile(Json.encodeToString(books))
    }

    private fun createFile(data: String) {
        val writer = BufferedWriter(FileWriter(filePath))
        writer.write(data)
        writer.close()
    }

}
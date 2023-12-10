package kpo.library.model

import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient

@Serializable
data class Book(
    val name : String?,
    val author : String?,
    @Transient
    private val page : Int? = 0,
    @Transient
    private val info : String? = null
) {

    override fun toString(): String {
        return "name: $name\n" +
                "author: $author\n" +
                "page: $page\n" +
                "info: $info\n"
    }
}
class IncorrectCommandExeption(
    cause : Throwable? = null
) : Exception(cause) {

    override val message : String
        get() = "Command not exist"
}

class IncorrectBookExeption(
    cause : Throwable? = null
) : Exception(cause) {

    override val message : String
        get() = "Incorret book"
}

class NoSuchBookInLibrary(
    cause : Throwable? = null
) : Exception(cause) {

    override val message : String
        get() = "There is no such book in the library"
}

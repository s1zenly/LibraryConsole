import kpo.library.pattern.Handler
import kpo.library.model.Library


val library = Library()


fun main() {
    waitCommand()
}


// Reader command customer
fun waitCommand() {
    menu()
    val command = readLine()?.toIntOrNull()
    // basic info
    print("Введите название книги: ")
    val name = readln()
    print("Введите автора: ")
    val author = readln()

    if(name == "" || author == "") {
        throw IncorrectBookExeption()
    }

    Handler(command, library).handler(name, author)

    exit()
}


// Menu function library
fun menu() {
    println("Добро пожаловать в библиотеку!\n" +
            "Я вас слушаю, выберите что вы хотите сделать\n" +
            "1 - Хочу пожертвовать вам книгу\n" +
            "2 - Хочу забрать у вас книгу\n" +
            "3 - Хочу посмотреть книгу\n" +
            "4 - Хочу узнать есть ли у вас книга")
}

// Exit with library
fun exit() {
    println("Это все? Введите y - yes или n - no")
    val answer = readLine()
    when(answer) {
        "y" -> println("Всего хорошего!")
        "n" -> waitCommand()
        else -> {
            println("Вы ввели не то, давайте еще раз!")
            exit()
        }
    }
}
fun main(args: Array<String>) {

    do {
        println("Task (hide, show, exit):")
        val inp = readln()
        when (inp) {
            "show" -> println("Obtaining message from image.")
            "hide" -> println("Hiding message in image.")
            "exit" -> println("Bye!")
            else -> println("Wrong task: $inp")
        }

    } while (inp != "exit")
}
package Material017

fun main() {
    print("Input number: ")
    val a = readLine() // String

    when(a) {
        "1" -> println("1. Your input number $a")
        "2" -> println("2. Your input number $a")
        "3" -> println("3. Your input number $a")
        else -> println("Your input another number")
    }
}

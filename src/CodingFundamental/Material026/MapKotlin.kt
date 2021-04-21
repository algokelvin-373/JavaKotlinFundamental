package Material026

fun main() {
    val map = mapOf(
        1 to "Java",
        4 to "Kotlin",
        8 to "Swift",
        9 to "Python"
    )
    for(x in map) {
        println("${x.key} - ${x.value}")
    }
}

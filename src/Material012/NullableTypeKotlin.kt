package Material012

fun main() {
//    val a: String = null // Error
    val b: String? = null

//    println(b.length) // Error
    if (b != null) {
        println(b.length)
    }
}


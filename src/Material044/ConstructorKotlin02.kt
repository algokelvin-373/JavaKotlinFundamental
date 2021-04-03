package Material044

fun main() {
    val javaCons0201 = JavaCons02("Call 1")
    println(javaCons0201.txt01)
    println(javaCons0201.txt02)
    val javaCons0202 = JavaCons02("Call 10", "Call 20")
    println(javaCons0202.txt01)
    println(javaCons0202.txt02)
}

class JavaCons02 {
    var txt01: String
        private set
    var txt02: String? = null
        private set

    constructor(msg01: String) {
        txt01 = msg01
    }
    constructor(msg01: String, msg02: String?) {
        txt01 = msg01
        txt02 = msg02
    }
}

package Material050

interface InterfaceKotlin {
    fun message()
}
fun main() {
    val KotlinInterface = KotlinInterface()
    KotlinInterface.message()
}

class KotlinInterface : InterfaceKotlin {
    override fun message() { println("This is interface method") }
}

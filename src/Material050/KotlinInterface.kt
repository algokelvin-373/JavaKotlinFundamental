package Material050

interface InterfaceJava {
    fun message()
}
fun main() {
    val javaInterface = JavaInterface()
    javaInterface.message()
}

class JavaInterface : InterfaceJava {
    override fun message() {
        println("This is interface method")
    }
}

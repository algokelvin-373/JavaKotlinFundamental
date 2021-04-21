package Material037

fun main() {
    val encapsulKotlin = EncapsulKotlin()
    val msg = encapsulKotlin.getMsg()
    println(msg)
}
class EncapsulKotlin {
    private val msg = "Algokelvin"

    fun getMsg(): String {
        return msg
    }
}

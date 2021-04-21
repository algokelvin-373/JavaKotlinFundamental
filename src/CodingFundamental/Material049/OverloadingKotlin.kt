package Material049

fun main() {
    val overloadKotlin = OverloadKotlin()
    overloadKotlin.method01("Kotlin")
    overloadKotlin.method01("Kotlin", "Kotlin")
}
class OverloadKotlin {
    fun method01(msg1: String?) { println(msg1) }
    fun method01(msg1: String, msg2: String) { println("$msg1 $msg2") }
}

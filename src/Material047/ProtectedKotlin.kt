package Material047

fun main() {
    val childClassKotlin02 = ChildClassKotlin02("This is msg01", "This is msg02")
//    childClassKotlin02.msg01 // Can't access because 'msg01' is protected
    val msg01 = childClassKotlin02.setMsg01() // Get 'msg01' protected
    val msg02 = childClassKotlin02.msg02 // Get 'msg02' no protected
    println(msg01)
    println(msg02)
}
open class ParentClassKotlin02(protected val msg01: String, val msg02: String)

class ChildClassKotlin02(msg01: String, msg02: String) : ParentClassKotlin02(msg01, msg02) {
    fun setMsg01(): String {
        return msg01
    }
}

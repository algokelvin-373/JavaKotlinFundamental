package Material034

fun main() {
    val txt = "You call this function with parameter and return"
    val msg = functionWithParamAndReturn(txt)
    println(msg)
}
fun functionWithParamAndReturn(txt: String): String {
    return txt
}

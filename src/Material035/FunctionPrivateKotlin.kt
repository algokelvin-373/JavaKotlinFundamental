package Material035

fun main() {
    val method01 = Method01()
    // method01.setFunctionPrivate() You can't call this
    method01.getFunctionPrivate()
}
class Method01 {
    private fun setFunctionPrivate() {
        println("You call this function private")
    }
    fun getFunctionPrivate() {
        setFunctionPrivate()
    }
}

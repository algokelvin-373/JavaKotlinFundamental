package Material035

fun main() {
    val method02 = Method02()
    // method01.setFunctionPrivate() You can't call this
    method02.getFunctionPrivate()
}
class Method02 {
    private fun setFunctionPrivate() {
        println("You call this function private")
    }
    fun getFunctionPrivate() {
        setFunctionPrivate()
    }
}

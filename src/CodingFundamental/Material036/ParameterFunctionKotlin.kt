package Material036

fun main() {
    callMethod(1)
    callMethod(1, 2)
}
fun callMethod(x: Int) {
    println("Method $x")
}
fun callMethod(x: Int, y: Int) {
    println("Method $x and Method $y")
}

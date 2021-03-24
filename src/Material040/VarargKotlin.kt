package Material040

fun main() {
    showNumber(373) // 1 number
    showNumber(1, 2, 3, 4, 5) // 5 number
}
fun showNumber(vararg x: Int) {
    for (i in x) {
        print("$i ")
    }
    println()
}

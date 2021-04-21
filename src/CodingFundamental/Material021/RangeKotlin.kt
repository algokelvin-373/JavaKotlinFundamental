package Material021

fun main() {
    val a = 1..10
    val b = 1..10 step 2
    val c = 1.rangeTo(10)
    val d = 10.downTo(1)
    a.forEach { print("$it ") }
    println()
    b.forEach { print("$it ") }
    println()
    c.forEach { print("$it ") }
    println()
    d.forEach { print("$it ") }
    println()
}

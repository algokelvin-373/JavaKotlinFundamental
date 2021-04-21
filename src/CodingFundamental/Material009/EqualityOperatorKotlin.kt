package Material009

fun main() {
    //Primitive Type
    val a = 5; val b = 5; val c = 10
    println("${a == b} ${a == c}") // true false
    println("${a.equals(b)} ${a.equals(c)}") // true false
    println("${a === b} ${a === c}") // true false
    println()

    //Object Type
    val x = Integer(10); val y = Integer(10)
    val z = Integer(5)
    println("${x == y} ${x == z}") // true false
    println("${x.equals(y)} ${x.equals(z)}") // true false
    println("${x === y} ${x === z}") // false false
}

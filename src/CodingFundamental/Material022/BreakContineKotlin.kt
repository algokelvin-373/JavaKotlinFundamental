package Material022

fun main() {
    // Break
    for (x in 1..10) {
        if (x == 5)
            break
        print("$x ")
    }
    println()

    // Continue
    for (x in 1..10) {
        if (x == 5)
            continue
        print("$x ")
    }
    println()
}

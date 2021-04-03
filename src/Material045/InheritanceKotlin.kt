package Material045

fun main() {
    val childClassKotlin = ChildClassKotlin()
    childClassKotlin.setMethodChild()
    childClassKotlin.setMethodParent()
}

open class ParentClassKotlin {
    fun setMethodParent() {
        println("You call parent class")
    }
}

class ChildClassKotlin : ParentClassKotlin() {
    fun setMethodChild() {
        println("You call child class")
    }
}

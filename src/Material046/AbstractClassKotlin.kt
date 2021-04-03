package Material046

abstract class KotlinAbstract {
    abstract fun methodAbstract()
    fun abstractWithToDo() {
        println("You call in KotlinAbstract")
    }
}

class SampleClassKotlin : KotlinAbstract() {
    override fun methodAbstract() {
        println("You call outside KotlinAbstract")
    }
}

fun main() {
    val sampleClassKotlin = SampleClassKotlin()
    sampleClassKotlin.methodAbstract()
    sampleClassKotlin.abstractWithToDo()
}

package Material029

data class UserKotlin(
    val id: Int = 373,
    val name: String = "Algokelvin"
)
fun main() {
    val user = UserKotlin()
    val id = user.id
    val name = user.name
    println("id : $id")
    println("name : $name")
}

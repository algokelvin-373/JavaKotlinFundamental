package Material030

data class PeopleKotlin(
    var id: Int,
    var name: String
)
fun main() {
    val people = PeopleKotlin(373, "Algokelvin")

    println("id : ${people.id}")
    println("name : ${people.name}")
}

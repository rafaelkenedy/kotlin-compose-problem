fun main() {

    val amanda = Person("Amanda", 33, "play tennis", null)
    val wendell = Person("Wendell", 30, "play videogames", amanda)

    amanda.showProfile()
    println()
    wendell.showProfile()
}

class Person(
    val name: String,
    val age: Int,
    val hobby: String?,
    val referrer: Person?
) {
    fun showProfile() {
        println("Name: $name")
        println("Age: $age")
        if (!hobby.isNullOrEmpty()) {
            print("Likes to ${hobby}.")
        }
        if (referrer != null){
            print(" Has a referrer named ${referrer.name}")
            if (!referrer.hobby.isNullOrEmpty()) {
                println(", who likes to ${referrer.hobby}.")
            } else println(".")
        } else {
            println(" Doesn't have a referrer.")
        }
    }
}


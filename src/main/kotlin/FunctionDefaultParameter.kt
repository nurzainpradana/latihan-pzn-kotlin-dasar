fun main() {
    hello("Zain")
    hello("Zain", "Pradana")

}

fun hello(firstName: String, lastName: String? = null) {
    if (lastName == null){
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}

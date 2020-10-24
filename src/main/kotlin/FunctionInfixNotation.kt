infix fun String.to(type: String): String {
    if (type == "UP") {
        return this.toUpperCase()
    } else {
        return this.toLowerCase()
    }
}

fun main() {
    val result = "Nur Zain Pradana" to "UP"
    val result2 = "Nur Zain Pradana" to "LOW"
    println(result)
    println(result2)

    1000 downTo 1 // Ini merupakan infix function juga
}

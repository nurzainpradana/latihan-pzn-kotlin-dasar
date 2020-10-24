fun main() {

    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    // Dengan membuat variabel lambda terlebih dahulu
    val lambdaUpper = {value: String -> value.toUpperCase()}
    println(hello("Zain", lambdaUpper))

    // Tanpa membuat variabel lambda terlebih dahulu
    println(hello("Zain", {value: String -> value.toLowerCase()}))

    // Trailing lambda lambda diluar braches parameter
    // fitur optional
    val result = hello("Zain Pradana"){ value: String ->
        value.toLowerCase()
    }

}
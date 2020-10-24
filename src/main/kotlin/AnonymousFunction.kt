fun main() {

    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransaform = transformer(name)
        return "Hello $nameTransaform"
    }

    val upper = fun(value: String): String {
        if (value==""){
            return "UPS"
        } else {
            return value.toUpperCase()
        }
    }

    println(hello("Zain", upper))
    println(hello("", upper))

    println(hello("Pradana", fun(value: String): String {
        return value.toLowerCase()
    }))

}
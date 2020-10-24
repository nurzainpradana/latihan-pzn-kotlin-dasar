/* fun hello(name: () -> String): String {
    // name merupakan lambda jadi pemanggilannya ${name()}
    return "Hello ${name()}"
}

 */

inline fun hello(name: () -> String): String {
    return "Hello ${name()}"
}

inline fun hello2(firstName: () -> String,
noinline lastName: () -> String): String {
    return "Hello ${firstName()}, ${lastName()}"
}

fun main() {
    // Menggunakan trailing lambda
    println(hello { "Nur" })
    println(hello { "Zain" })

    for (i in 1..100){
        println(hello2({"Nur"}, {"Zain"}))
    }

}
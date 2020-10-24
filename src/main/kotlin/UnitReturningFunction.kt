fun main() {
    printHello("Zain")
}

fun printHello(name: String?): Unit {
    if (name == null){
        println("Hello Bro")
    } else {
        println("Hello $name")
    }
}

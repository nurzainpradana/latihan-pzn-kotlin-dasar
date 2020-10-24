fun main() {
    val result = double(10)
    hi("Zain")
}

// Mengembalikan Data
fun double(a: Int): Int = a * 2

// Tidak Mengembalikan Data
fun hi(name: String): Unit = println("Hi $name")

// Menggunakan array
fun hitungTotal(values: Array<Int>) : Int {
    var total = 0

    for (value in values) {
        total += value
    }

    return total
}

fun hitungTotal2(vararg values: Int): Int {
    var total = 0

    for (value in values) {
        total += value
    }

    return total
}

fun main() {
    val values = arrayOf(10, 10, 10, 10)
    val result = hitungTotal(values)

    val result2 = hitungTotal2(10, 10, 10, 10)

    println(result)
    println(result2)
}
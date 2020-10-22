import kotlin.system.exitProcess

fun main() {
    var result1: Int = 1 / 3
    println(result1)

    var result2: Int = 10 + 10 / 2
    println(result2)

    val result3 = 10.0 / 3.0
    println(result3)

    // Augmented Assigment
    var total: Int = 0

    val barang1 = 100
    // total = total + barang1
    total += barang1

    val barang2 = 200
    // total = total + barang2
    total += barang2

    val barang3 = 300
    // total = total + barang3
    total += barang3

    total++ // total = total + 1
    total-- // total = total - 1

    println(total)

    val suhu = -5
    println(suhu)

    val sehat = true
    println(!sehat)



}

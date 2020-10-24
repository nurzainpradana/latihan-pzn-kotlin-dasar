fun main() {
    val result = sum(10, 10)
    println(result)


    println(bagi(100, 10))
    println(bagi(100, 0)) // ERROR PEMBAGIAN DI BAGI NOL
}

fun bagi(a: Int, b: Int): Int{
    /* val result = a / b
    return result
     */
    if (b == 0){
        return 0
    } else {
        val result = a / b
        return result
    }
}

fun sum(a: Int, b: Int): Int {
    val total = a + b
    return total //Mengembalikan nilai total bertipe Int

}

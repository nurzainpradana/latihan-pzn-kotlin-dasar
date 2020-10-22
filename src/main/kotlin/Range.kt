fun main() {
    // Tipe Data Range
    //val range = 1..100
    //val range = 100 downTo 1

    // range dengan step
    val range = 1 .. 100 step 5
    //val range = 100 downTo 1 step 5

    println(range.count())
    println(range.contains(50))
    println(range.contains(200))

    println(range.first)
    println(range.last)
    println(range.step)
}
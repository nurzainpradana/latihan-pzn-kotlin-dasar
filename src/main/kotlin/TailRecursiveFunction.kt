fun main() {
    tailrec fun display(value: Int) {
        println("Recursive $value")
        if (value > 0){
            display(value - 1)
        }
    }

    display(100)

    display(10000) // ERROR
    /*
    error di Recursice 4967 -> StackOverflowError
    karena terlalu dalam panggilan functionnya

    solusinya pakai tailrec
     */

    /*
    fun factorialRecursiveTail(value: Int): Int {
        return when(value){
            1 -> 1
            else -> value * factorialRecursiveTail(value - 1)
        }
    }
     */
    tailrec fun factorialRecursiveTail(value: Int, total: Int = 1): Int {
        return when(value){
            1 -> total
            else -> factorialRecursiveTail(value - 1, total * value)
        }
    }

    println(factorialRecursiveTail(10))
}
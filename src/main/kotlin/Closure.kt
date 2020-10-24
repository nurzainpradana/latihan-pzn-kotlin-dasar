fun main() {

    var counter: Int = 0
    var name: String = "Zain"

    val lambdaIncrement: () -> Unit = {
        println("Lambda Increment")
        counter++
        /*
        name = "Pradana"
        ini akan mengubah variabel name yang ada di func main
         */
    }

    val anonymousIncrement = fun(){
        println("Anonymous Function Increment")
        counter++
    }

    fun functionIncrement(){
        println("Function increment")
        counter++
    }

    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()
    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()

    println(counter)
}
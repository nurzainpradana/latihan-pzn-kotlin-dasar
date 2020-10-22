fun main() {
    // FOR ARRAY
    val names = arrayOf("Nur", "Zain", "Pradana", "Ahmad", "Pratama")

    var total = 0
    //Buat sebuah variable name
    for (name in names) {
        println(name)
        total++
    }

    println("Total perulangan yaitu $total")

    // FOR RANGE
    for (value in 1..100) {
        print("$value ")
    }

    println(" ")

    for (value in 1000 downTo 0 step 5) {
        print("$value ")
    }

    var lengthArray = names.size - 1

    for (value in 0..lengthArray) {
        println(names[value])
        println("Index $value = ${names.get(value)}")
    }
}
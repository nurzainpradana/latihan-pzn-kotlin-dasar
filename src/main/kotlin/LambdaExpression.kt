fun toUpper(value: String): String = value.toUpperCase()

fun main() {
    // Membuat Lambda yang dimasukan ke variable
     val contohLambda: (String, String) -> String = { firstName: String, lastName: String ->
         val result = "$firstName $lastName"
         result
    }

    val result = contohLambda("Nur", "Zain")
    println(result)

    // it
    /* val sayHello: (String) -> String = { value: String ->

    }

     */

    // Jika hanya 1 parameter bisa tidak di deskripsikan parameternya, secara default akan menjadi it
    val sayHello: (String) -> String = {
        "Hello $it"
        //$it representasi dari parameter pertama
    }

    println(sayHello("Zain"))

    // Membuat lambda metod reference
    val toUpperCase: (String) -> String = ::toUpper
    println(toUpperCase("Nur Zain P"))
}
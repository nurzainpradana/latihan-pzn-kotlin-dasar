fun main() {
    val finalExam = 'A'

    when (finalExam) {
        'A' -> {
            println("Amazing")
        }
        'B' -> {
            println("Good")
        }
        'C' -> {
            println("Not Bad")
        }
        'D' -> {
            println("Bad")
        }
        'E' -> {
            println("Try Again Next Year")
        }
        else -> {
            println("Ups")
        }
    }

    // When Expression with multiple option

    when(finalExam){
        //if (finalExam == 'A' || finalExam == 'B' || finalExam == 'C')
        'A', 'B', 'C' -> {
            println("Pass")
        }
        else -> {
            println("Not Pass")
        }
    }

    // When Expression with in
    val passValues = arrayOf('A', 'B', 'C')

    when (finalExam){
        in passValues -> println("Pass")
        !in passValues -> println("Try Again    ")
    }

    // When Expression with is
    val name = "Zain"
    when (name){
        is String -> println("Ini merupakan tipe data String")
        !is String -> println("Ini bukan merupakan tipe data String")
    }

    // When sebagai pengganti IF ELSE
    // When Tanda Variable
    val examValue = 90
    when {
        examValue > 80 -> println("Good Job")
        examValue > 60 -> println("Not Bad")
        else -> println("Try Again Next Year")
    }
}
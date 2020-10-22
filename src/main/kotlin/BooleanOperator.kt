fun main() {
    val finalExam = 80
    val attendant = 75
    val extra = 70

    val passFinalExam = finalExam > 75
    val passAttendant = attendant > 80
    val passExtra = extra > 75

    //val pass = passFinalExam && passAttendant
    val pass = passFinalExam && passAttendant && passExtra
    // val pass = ((passFinalExam && passAttendant) && passExtra)
    // val pass = passFinalExam || passAttendant || passExtra

    println(pass)
}
fun main() {
    sayHello("Nur", "Zain")
}

//Function Parameter
fun sayHello(firstName: String, lastName: String) {
    //Parameter sudah pasti bersifat val, tidak bisa diubah ke var
    println("Hello $firstName $lastName")
}

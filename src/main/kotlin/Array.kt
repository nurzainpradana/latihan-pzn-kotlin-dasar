fun main() {
    // Tipe Data Array
    // Tipe data yang berisi kumpulan data dengan tipe data yang sama
    // <> -> Diamond Expression -> Kotlin Generics
    val members: Array<String> = arrayOf("Nur", "Zain", "Pradana")
    val values: Array<Byte> = arrayOf(100, 95, 95)
    val balances: Array<Int> = arrayOf(10_000, 20_000, 30_000)

    // Mengakses Data Array
    //println(members)

    // Operasi Array

    val members2: Array<String> = arrayOf("Junior", "Mobile", "Programming")
    val junior: String = members2[0]
    val mobile: String = members2.get(1)
    val programming: String = members2.get(2)

    // val itu merubah variabelnya bukan mengubah isi datanya

    // members2.set(0, "Pelatihan")
    members2[0] = "Pelatihan"
    val pelatihan: String = members2.get(0)
    println(members2[0])

    val nilai: Array<Int> = arrayOf(100, 90, 80)
    println(nilai[0])
    println(nilai[1])
    println(nilai[2])

    //members2[0] = null

    // Array Nullable
    val names2: Array<String?> = arrayOfNulls(5)
    names2.set(0, "Nur")
    names2.set(1, null)
    names2.set(2, "Zain")
    names2.set(3, null)
    names2.set(4, "Pradana")

    val names3: Array<String?> = arrayOfNulls(5)
    names3[0] = "Eko"
    names3[1] = "Eko"
    names3[2] = "Eko"
    names3[3] = null
    names3[4] = "Eko"
    // names3[5] = "Eko"
    // Array tidak dinamis

    println(names3.size)
    // array bernilai null tetap dihitung



}
package kotlinfundamental

fun main() {
    val names: Array<String> = arrayOf("ilham", "oktavian", "faradilla", "ai")
    val age : Array<Int> = arrayOf(20,21,22,23)

    /*
        OPERASI ARRAY
        OPERASI =>KETERANGAN
        size => untuk mendapatkan panjang array
        get(index) => mendapatkan data di posisi index
        [index] => sama kaya diatas
        set(index, value) => mengubah data di posisi index
        [index] = value =>mengubah data di index
     */

    println(names.size) // 4
    println(names[0]) // ilham
    names.set(1, "japra")
    println(names[1]) // japra


}
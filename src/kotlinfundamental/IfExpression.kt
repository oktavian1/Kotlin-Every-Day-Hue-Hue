package kotlinfundamental

fun main() {

    val num: Int = 62

//    if (num in 50..60){
//        println("yeay lebih 50")
//    } else if (num in 61..89) {
//        println("good")
//    }else if ( num > 90){
//        print("Perfect")
//    }else {
//        print("so bad")
//    }

    when {
        num in 50..60 -> {
            println("yeay lebih 50")
        }
        num in 61..89 -> {
            println("good")
        }
        num > 90 -> {
            print("Perfect")
        }
        else -> {
            print("so bad")
        }
    }

    val jamBuka = 8
    val sekarang = 12
    val sign: String

    sign = if (jamBuka < sekarang){
        "Sudah Dibuka Gan"
    } else{
        "Sudah Ditutup gan"
    }

    print(sign)
}
package kotlinfundamental

fun main() {

    // SAFE CALL OPERATOR
    // menjamin code kita aman dari nullpointer exception

    val text: String? = null
    text?.length

    // ELVIS OPERATOR
    // elvis operator memungkinkan kita menetapkan default value atau nilai dasar jika objek null

    val text2: String? = null
    val textLength = text2?.length ?: 0
    // sama aja seperti if ini
    val textLength2 = if (text2 != null) text2.length else 0
}
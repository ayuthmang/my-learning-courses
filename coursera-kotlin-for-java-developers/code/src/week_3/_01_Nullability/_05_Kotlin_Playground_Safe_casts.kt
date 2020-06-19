package week_3._01_Nullability

// Safe casts
// Type cast as throws ClassCastException, if the cast is unsuccessful. Safe cast as? returns null, if the cast is unsuccessful. Declare the s variable to make the first line print null and the second one throw an exception.

fun main(args: Array<String>) {
    val s: String? = "THROW!"
    println(s as? Int)    // null
    println(s as Int?)    // exception
}
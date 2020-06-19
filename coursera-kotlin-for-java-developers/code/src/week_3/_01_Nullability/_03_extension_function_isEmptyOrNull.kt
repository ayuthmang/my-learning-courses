package week_3._01_Nullability

infix fun<T> T.eq (other: T) {
    if (this == other) println("OK")
    else println("Error: $this != $other")
}

fun String?.isEmptyOrNull() = this == null || this.isEmpty()

fun main(args: Array<String>) {
    var s: String? = null
    var s1: String? = null
    val s2: String? = ""
    s1?.isEmptyOrNull() eq true
    s2.isEmptyOrNull() eq true

    val s3 = "   "
    s3.isEmptyOrNull() eq false
}
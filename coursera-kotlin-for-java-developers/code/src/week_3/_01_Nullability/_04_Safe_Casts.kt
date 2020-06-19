package week_3._01_Nullability

/** Safe Casts **/

// Type cast: as
/*
if (any is String) {    // is = instance of
    val s = any as String   // as string = typecast, not necessary
    s.toUpperCase()
}

if (any is String) {
    any.toUpperCase() // any = smart cast
}
*/

/** Safe cast: as? **/
// type cast throws an exception if can't be casted
// while safe cast returns null in this case
/*
if (any is String) {
    any.toUpperCase()
}
*/
// (any as? String)?.toUpperCase()

// Safe Cast
// foo as? Type
// - foo is Type? returns foo as type
// - foo !is type? returns null

// Safe Cast: as?
// returns null if expression cannot be cast
// val s = if (a.is String) a else null
//          |
//          |
//          |
//          |
//          v
// val s: String? = any as? String

/** Quiz **/
// Declare the s variable to make the first line print null and the second one throw and exception
val s: String? = "THROW!"
fun main() {
    println(s as? Int)
    println(s as Int)
}

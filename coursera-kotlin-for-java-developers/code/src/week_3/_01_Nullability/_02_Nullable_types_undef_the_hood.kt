package week_3._01_Nullability

/** Nullable Types Under the Hood **/
// @Nullable, @NotNull annotations, no performance overhead
// Nullable types != Optional
//  class Optional<T>(val value: T) {
//      fun isPresent() = value != null
//      fun get() = value ?: throw NoSuchElementException("No value present")
//  }
// Nullable don't create an object, just use an annotation
// But optional create an object that pointed to reference


/** Quiz: How many objects are created to store the value of nullable String? **/

// val s: String?
// 1. Two: one object to store a String value, another (a wrapper) to store a nullable String
// 2. Only one object to store a String value
// 🟢 answer: 2

fun foo(): String = "foo"
fun bar(): String? = "bar"

// Under the hood
// @NotNull
// public static final String foo() {
//     return "foo";
// }
//
// @Nullable
// public static final String bar() {
//     return "bar"
// }

/** List of nullable elements vs nullable list **/
// List<Int?> --> [Int: null]
// List<Int>? --> [Int] or null

/** Question 2: Mark the lines which require a question mark to make the code compile **/
//  fun foo(list1: List<Int?>, list2: List<Int>?) {
//      list1.size
//      list2.size
//
//      val i: Int =
//          list1.get(0)
//      val j: Int =
//          list2.get(0)
//  }


fun foo(list1: List<Int?>, list2: List<Int>?) {
    list1.size
    list2?.size

    val i: Int? =
        list1.get(0)
    val j: Int? =
        list2?.get(0)
}
// Ans
// list2?.size
// val i: Int? =
// val j: Int? =  // Compiler error: Type mismatch: inferred type is Int? but Int was expected
// list2.get(0)

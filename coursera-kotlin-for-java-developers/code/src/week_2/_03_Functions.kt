package week_2

//fun max(a: Int, b: Int): Int {
//    return if (a > b) a else b
//}

// expression body
fun max(a: Int, b: Int) = if (a > b) a else b


// Function returning Unit
fun displayMax(a: Int, b: Int) {
    println(max(a, b))
}

// an equivalent syntactic form
//fun displayMax(a: Int, b: Int): Unit {
//    println(max(a, b))
//}


/*** Functions everywhere ***/

// Top-level function:  fun topLevel() = 1

// Member function: fun class A { fun member() = 2 }

// Local function:
// fun other() {
//    fun local() = 3
// }


/*** Using @JvmName annotation ***/

// Extensions.kt
//  @file:JvmName("Util")
//  package intro
//  fun foo() = 0

//  JavaUsage.java
//  package other

//  import intro.Util

//  public class JavaUsage {
//      public static void intro.main(String[] args) {
//          int i = Util.foo();
//      }
//  }
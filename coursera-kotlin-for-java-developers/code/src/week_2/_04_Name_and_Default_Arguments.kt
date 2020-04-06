package week_2

/* Quiz */
/*fun intro.main() {
    println(listOf('a', 'b', 'c').joinToString(
        separator = "", prefix = "(", postfix = ")"))

    println(listOf('a', 'b', 'c').joinToString(postfix = "."))
}*/

/*** Functions: default values ***/
fun main() {
    fun displaySeparator(character: Char = '*', size: Int = 10) {
        repeat(size) {
            print(character)
        }
    }
    displaySeparator('#', 5)    // #####
    displaySeparator('#')            // ##########
    displaySeparator()                        // **********

    /*** Functions: named arguments ***/
    displaySeparator(size = 5)

    /*** Quiz ***/
    // displaySeparator(3, '5')    // the code won't compile

    /*** Calling a function with default arguments from Java ***/
    // fun sum(a: Int = 0, b: Int = 0, c: Int = 0) = a + b + c

    // UsingSum.java, providing values for all arguments
    // sum(1, 2, 3)

    // @JvmOverloads annotation
    // @JvmOverloads
    fun sum(a: Int = 0, b: Int = 0, c: Int = 0) = a + b + c

    // UsingSum.java
    sum(1)

    /*** Quiz: How many argument combinations are possible? ***/
    // fun sum(a: Int = 0, b: Int = 0, c: Int = 0) = a + b + c
    // answer: 8

    // @JvmOverloads annotation
    // Only 4 overloaded functions are generated
    // public static final int sum(int a, int b, int c)
    // public static final int sum(int a, int b)
    // public static final int sum(int a)
    // public static final int sum()
}

// Test @JvmOverloads
@JvmOverloads
fun sum(a: Int = 0, b: Int = 0, c: Int = 0) = a + b + c
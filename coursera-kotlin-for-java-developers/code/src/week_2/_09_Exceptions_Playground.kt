package week_2

import java.io.IOException

// Java compiler will complain exception not thrown in corresponding try block
// If you want to run this code in java and want to handle it in java we use the @Throws in _09_bar below
// to tell the compiler we're gonna throw something, if calls in kotlin it's fine no need to add annotation
fun _09_foo() {
    throw IOException()
}

@Throws(IOException::class)
fun _09_bar() {
    throw IOException()
}
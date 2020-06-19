package week_2

// Sum as an extension function
// Change the 'sum' function so that it was declared as an extension to List<Int>.
fun sum(list: List<Int>): Int {
    var result = 0
    for (i in list) {
        result += i
    }
    return result
}

fun main() {
    val sum = sum(listOf(1, 2, 3))
    // val sum = listOf(1, 2, 3).sum()  // ans
    println(sum)    // 6
}

// Answer
// fun List<Int>.sum(): Int {
//     var result = 0;
//     for (i in this) {
//         result += i;
//     }
// }
package week_3._02_Functional_Programming

/** Common Operations on Collections **/
val list: List<Int> = listOf(1, 2, 3)
fun main() {
    println(list.partition { it % 2 == 0 })

    println(list.associate { 'a' + it to 10 * it })

    val list = listOf("123", "45")
    println(list.flatMap { it.toList() }) // [1, 2, 3, 4, 5]


}
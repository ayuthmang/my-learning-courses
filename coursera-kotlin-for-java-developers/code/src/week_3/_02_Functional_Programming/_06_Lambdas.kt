package week_3._02_Functional_Programming

/** Lambdas **/

// val employees: List<Employee>
// data class Employee(val city: City, val age: Int)
// employees.filter { it.city == City.PRAGUE }
//          .map { it.age }
//          .average()

/** Lambda syntax **/
// { x: Int, y: Int -> x + y }
// list.any({ i: Int -> i > 0 })    // full syntax
// list.any { i: Int -> i > 0 }     // parentheses can be omitted
// list.any { i -> i > 0 }          // type can be omitted if it's clear from the context
// list.any { it > 0 }              // it denotes the argument if it's only one

/** Multi-line lambda **/
// list.any {                       // Multi-line lambda
//      println("processing $it")
//      it > 0                      // the last expression is the result
// }

/** Destructuring declrations **/
// map.mapValues { entry -> "${entry.key} -> ${entry.value}!"}
// map.mapValues { (key, value) -> "${key} -> ${value}!"}
// map.mapValues { (_, value) -> "${value}"}   // omit the parameter name if the parameter is unused
package week_2

/*** Quiz ***/
// open class Parent
// class Child: Parent()
//
// fun Parent.foo() = "parent"
// fun Child.foo() = "child"
//
// fun main(args: Array<String>) {
//     val parent: Child = Child()
//     println(parent.foo())
// }

// What will be printed?
// 1. parent
// 2. child

// answer is parent
// Why?
// The analogous code in Java
// public static String foo(Parent parent) { return "parent"; }
// public static String foo(Child child) { return "child"; }
//
// public static void main (String[] args) {
//     Parent parent = new Child();
//     // Parent parent = (new Random().nextBoolean()) ? new Parent() : new Child;
//     System.out.println(foo(parent));
// }

/*** Quiz 2 ***/
// What will be printed?
// 1. *
// 2. a
// 3. b
fun String.get(index: Int) = '*'
fun main() {
    println("abc".get(1))
}
// answer: b
// member always win!


/*** Extensions don't hide members ***/
//  class A {
//      fun foo() = 1
//  }
//  fun A.foo() = 2
//  A().foo() /// 1

/*** Extensions can overload members ***/
//  class A {
//      fun foo() = "member"
//  }
//
//  fun A.foo(i: Int) = "extension($i)"
//  A().foo(2) // extension(2)


/*** An extension can't hide a member completely, but can overload it ***/
// IGNORE_BACKEND: JS_IR
// EXPECTED_REACHABLE_NODES: 1116
// FILE: A.kt
package foo

open class A() {
    fun f() = 3
}

fun box(): String {
    return if ((A().f() + bar.A().f()) == 9) "OK" else "fail"
}


// FILE: B.kt
package bar

open class A() {
    fun f() = 6
}
package Basics

/*
* Kotlin has three structural jump expressions:

* return. By default returns from the nearest enclosing function or anonymous
* function.
* break. Terminates the nearest enclosing loop.
* continue. Proceeds to the next step of the nearest enclosing loop.
 */

/*
 Labels in Kotlin
 You can apply labels to almost any expression in kotlin by just typing name
 of the label and then attaching a @ at the end of the name.
 */

fun foo() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return // non-local return directly to the caller of foo()
        print(it)
    }
    println("this point is unreachable")
}

fun fooWithLocalFunction() {
    listOf(1, 2, 3, 4, 5).forEach lit@{
        if (it == 3) return@lit // local return to the caller of the lambda, i.e. the forEach loop
        print(it)
    }
    print(" done with explicit label")
}

fun fooWithLocalForEach() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return@forEach // local return to the caller of the lambda, i.e. the forEach loop
        print(it)
    }
    print(" done with implicit label")
}

fun fooWithAnonymousForEach() {
    listOf(1, 2, 3, 4, 5).forEach(fun(value: Int) {
        if (value == 3) return  // local return to the caller of the anonymous fun, i.e. the forEach loop
        print(value)
    })
    print(" done with anonymous function")
}

fun fooWithNestedLoop() {
    run loop@{
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return@loop // non-local return from the lambda passed to run
            print(it)
        }
    }
    print(" done with nested loop")
}

/*
* All of these examples are taken from the reference page itself.
* https://kotlinlang.org/docs/reference/returns.html
 */
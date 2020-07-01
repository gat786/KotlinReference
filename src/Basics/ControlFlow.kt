package Basics

/*
* Control Flows in Kotlin include If, When, For and While
*
* Kotlin has no ternary operator because if itself is an expression i.e.
* it returns a value
 */

fun ifElseExample(a:Int,b:Int):Int{
    return if (a > b) a else b
}

fun anotherExample(a:Int, b: Int){
    // the last line or statement in your if,else if,else block will be returned
    // by the block when the conditions are executed.
    // Example

    val larger =
    if (a>b){
        println("A is bigger")
        a
    }else{
        println("B is bigger or they both are same")
        b
    }
}


/*
* Kotlin has a replacement to the old and boring switch case that we are all used to
 */
fun whenExpression(option:Int){
    // you can have multiple cases in one line just separate them using comma
    when(option){
        6 -> println("Yo that's a huge sixer!")
        5 -> println("Something went horribly wrong or you just ran very fast")
        4 -> println("Racing towards the ropes fielder wont be able to get there")
        1,2,3 -> println("Normally you get those runs")
        else -> println("Something wild happened here")
    }
}


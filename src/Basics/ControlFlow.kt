package Basics

import java.lang.Integer.parseInt

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


fun whenExpressionVariant1(number:Int){
    val validNumbers = listOf(2,4,6,8,10)
    when(number){
        parseInt("1")-> println("This is one bros")
        in validNumbers -> print("Is a valid number")
        in 3..11 step 1 -> println("is a odd number in between 2-11")
        else -> println("I didn't plan for it to come should've thought earlier")
    }
}

/*
* Loops
* Kotlin supports for, while and do while loops
* and they are almost as same as it would work in any other language
* They are written as in the below functions.
*
* You have to use the for and while loops in kotlin as if they were of python.
* for loops in kotlin are a little different than the ones we see in java.
 */

fun forLoops(){
    for(i in 1..3){
        println(i)
    }

    // for looping through a collective
    val validRanges = listOf(1,2,5,10,20,50,100,200,500,2000)
    for(i in validRanges){
        println("Current number is $i")
    }

    // for looping through a collectible with index
    for(i in validRanges.withIndex()){
        println("Index is ${i.index} and value is ${i.value}")
    }
}

fun whileLoops(i:Int){
    var iterator = i
    while (iterator > 10){
        println("I is greater than 10 and currently is $iterator")
        iterator--
    }
}

fun doWhileLoops(){
    do {
        println("We are doing some work in do block!")
    }while (false)
}

fun main() {
    whileLoops(113)
    doWhileLoops()
}

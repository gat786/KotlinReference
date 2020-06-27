package Basics

fun printingSomethingToConsole(){
    print("This can print anything so lets do the obvious! Hello World!!!")
    // you can manually add \n here to get a new line

    println("This is the same with a newline thingy attached at the end")
    // \n is automatically attached at the end here

    val variable = 123
    println("Print some numbers like this ${123} or a variable like this $variable")

    val variable2 = 246
    println("You can do some comparison stuff like ${variable < variable2}")
    println("You can do some addition stuff like ${variable + variable2}")
    println("You can do some subtraction stuff like ${variable - variable2}")
    println("You can do some multiplication stuff like ${variable * variable2}")
    println("You can do some modulo stuff like ${variable % variable2}")
}

/*
* Basic Types in Kotlin
* Numbers
* Name      Bits
* Byte      8
* Short     16
* Int       32
* Long      64
*
* Float     32      prefix f or F
* Double    64      no prefix a floating point number is automatically thought of as a Double
* */

fun creatingNumbers(){
    val num : Int = 1
    val num2 = 2 // if you declare a number directly it infers as an Int
    val shortNum : Short = 3
    val byteNum : Byte = 127 // you cant make it larger than this 127 is the maximum point

    val floatingNumber = 1.23
    val floatingNumber2 = 1.23f

    // you can use underscore to create a fancy pants number
    // [ it looks cool nothing else changes ]
    val fancyPantsNumber = 111_222_333
    val fancyPantsNumber2 = 1.333_222_444
}

/* Literal Constants
* Decimals - 123, 456
* Hex - 0x0f
* Binary - 0b00001011
*
* Doubles - 1.23
* Floats - 1.23f
 */

fun literalConstants(){
    println("Normal Integer ${123}")
    println("Hexadecimal Number ${0xff}")
    println("Binary Number ${0b00001011}")

    println("Double Number ${1.23}")
    println("Float Number ${1.23f}")
}

fun main() {
    printingSomethingToConsole()
}
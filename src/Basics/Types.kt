package Basics

import kotlin.math.*

fun printingSomethingToConsole(){
    print("This can print anything so lets do the obvious! Hello World!!!")
    // you can manually add \n here to get a new line

    println("This is the same with a newline thingy attached at the end")
    // \n is automatically attached at the end here

    // lets do some string templates and cool stuff with it!
    val variable = 123
    println("Print some numbers like this ${123} or a variable like this $variable")

    val variable2 = 246
    // you can do basic operations inside the curly brackets and output of
    // it will be displayed to the user on the console or where ever you
    // out the string
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

/* Kotlin demands you to do everything explicitly
* There are no implicit conversions and almost all of the conversions are done
* using helper functions.
*
* Explicit Conversions
*
* You can convert any numerical value to change its data types
* kotlin has wide range of conversion functions to facilitate this.
*
* toByte()
* toShort()
* toInt()
* toLong()
* toFloat()
* toDouble()
* toChar()
 */

fun conversionsData(){
    val a : Int = 2
    // int to byte conversion explicitly no errors
    val b : Byte = a.toByte()
    // if you uncomment this it will through a red squiggly and get angry on you
    // val c : Long = a
}

/*
* Divisions in Kotlin
* Every division done on integer returns integer itself
* if you want to have floating point numbers as a result you will have to
* manually make one of the numbers as a floating point nnumber and then
* divide them
 */

fun divideStuff(){
    val a : Int = 50
    val b : Int = 2

    val c = a / b
    println("A = $a \nB = $b\nA/B = $c")

    val d = a / b.toFloat()
    println("A = $a \nB = ${2.5f}\nA/B = $d")
}

/*
* Bitwise Operators
*
* shl(bits) – signed shift left
* shr(bits) – signed shift right
* ushr(bits) – unsigned shift right
* and(bits) – bitwise and
* or(bits) – bitwise or
* xor(bits) – bitwise xor
* inv() – bitwise inversion

 */

fun Int.toBinary(len: Int = 8): String {
    return String.format("%" + len + "s", this.toString(2)).replace(" ".toRegex(), "0")
}

fun bitwiseOperations(){
    val a = 1 // 0001
    val b = 5 // 0101

    println("Logical AND is ${a and b}")
    println("Logical OR is ${a or b}")

    // shifting of bits
    // no_of_bits_to_shift shl / shr / ushr bits_that_you_want_to_shift
    println("Shift right of $a is ${a shr 2} and representation " +
            "is ${(a shr 2).toBinary()}")
    println("Shift left of $a is ${a shl 2} and representation " +
            "is ${(a shl 2).toBinary()}")

    println("Shift right of $b is ${b shr 2} and representation " +
            "is ${(b shr 2).toBinary()}")
    println("Shift left of $b is ${b shl 2} and representation " +
            "is ${(b shl 2).toBinary()}")

    // inverse of bits
    println("Inverse of $a in bits is ${a.inv()}")
}

/*
* Characters - Char
* Char are variables which hold one length string i.e. string which has a length of one
* a char can be defined as
* val character : Char 'a'
* They can not directly be viewed as ints and you will need to convert them
* manually if you wish to perform some actions on them as an int.
 */

fun characterTest(){
    val character = 'a'
    val character2 : Char = 'b'
}

/*
* Booleans -
* Booleans as you would guess are data types which hold kind of a binary data. i.e. either true
* or false
*
* you can use binary functions on booleans like
* || - lazy disjunction // basically or gate
* && - lazy conjunction // basically and gate
* ! - negation // basically negates the boolean data
 */

fun booleansData(){
    val bool1 = true
    val bool2 : Boolean = false

    println("Disjunction would be ${bool1 || bool2}")
    println("Conjunction would be ${bool1 && bool2}")
    println("Negation would be ${!bool1}")
}

/*
* Arrays -
* In computer science, an array data structure, or simply an array, is a data
* structure consisting of a collection of elements, each identified by at least
* one array index or key.
*
* you can create arrays of data types using the
* intArrayOf()
*
 */

fun funWithCollectives(){
    val intArray = intArrayOf(1,2,3,4,5,6)
    var intList = listOf<Int>(1,2,3,4,5)
    /*
    * List and Arrays are similar its just arrays are mutable in the sense they
    * have a set property on its element while Lists Don't have those.
    * If you uncomment the next two lines you will see the difference.
    * intArray[2] = 20
    * intList[2] = 20
    *
    * Both have fixed length so once created you cannot append elements
    * If you want a list with undetermined length you can use MutableList
    */

    val changeAble = mutableListOf<Int>(1,2,3,4)
    changeAble[2] = 10
    changeAble.add(23)
    println("Changeable lists content are $changeAble")

    val intArrayFactoryMethod = IntArray(5){ it }
    //val intArrayFactoryMethod = IntArray(5){ it.toDouble().pow(2).toInt() }


    println("IntArray with factory method ${intArrayFactoryMethod.toList()}")
}

/*
* Strings
* Strings are immutable data type in kotlin it can be defined as
* val someStringName = "Random String Text"
* you can access the data from index like
* print(someStringName[1]) will print "a"
*
 */

fun stringUsage(){
    val str : String = "Hello World! How are you!"
//    for(i in str){
//        print(i)
//    }

    val stringRaw = """
        I can type almost anything in here
        even escape characters like / \ $ % , " " 
        and it would work perfectly fine thanks to RawStrings
        these can be use full to type long random strings which require no edits
        and variable inputs. 
        The line endings are also preserved here.
    """.trimIndent().trimIndent()

    println(stringRaw)
}

fun main() {
    stringUsage()
}
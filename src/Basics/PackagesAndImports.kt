package Basics

/*
* A number of packages are imported into every Kotlin file by default:
*
* kotlin.* - contains the basic things supported all over in any kotlin
* environment
* kotlin.annotation.* - contains all the annotation support for kotlin
* kotlin.collections.* - Collection types, such as Iterable, Collection, List,
* Set, Map and related top-level and extension functions.
* kotlin.comparisons.* (since 1.1) - contains stuff such as maxOf(), minOf()
* and descending()
* kotlin.io.* - IO API for working with files and streams.
* kotlin.ranges.* - Ranges, Progressions and related top-level and extension
* functions.
* kotlin.sequences.* - Sequence type that represents lazily evaluated
* collections. Top-level functions for instantiating sequences and extension
* functions for sequences.
* kotlin.text.* - Functions for working with text and regular expressions.
*
* it is not necessary for you to know every imports usage but i have mentioned
* it if for some reasons you want to know.
 */

/*
 Packages are like collection of classes and each package consists of classes
 that are related to that package.
 To import any class you use the normal import statement as well as you can
 include a whole package using a * in the statement that will basically import
 everything inside the package.
 */

import kotlin.math.*

fun math(){
    val number = 20
    println(number)
}

class OurFirstClass{

    fun firstFunction(){
        println("This is the first function i ever made inside a class")
    }
}

open class OurSecondClass{

    open fun secondFunction(){
        val firstClass = OurFirstClass()
        firstClass.firstFunction()
    }
}

fun main() {
    val secondClass = OurSecondClass()
    secondClass.secondFunction()
}
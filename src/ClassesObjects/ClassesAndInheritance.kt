package ClassesObjects

import Basics.math
import javax.management.loading.ClassLoaderRepository

// you can have a simplest class in kotlin like this
// if you dont declare a constructor the compiler automatically generates a no
// value constructor for you.

class ClassesAndInheritance {
    fun tryFunctions(){
        // see this works out of the box even if you dont have a primary
        // constructor
        val myClass = ClassesAndInheritance()

        // calling a class with private constructor
        // val person = Person()
    }
}

fun main() {
    ClassesAndInheritance().tryFunctions()
}

// you can declare an empty class like this.

class Empty


// kotlin primary constructors are directly called and added at the top level
// of class declaration and it have two types of parameters
// 1. showcasing value parameters

class Person private constructor(name:String){
    fun tryFunctions(){

    }
}


// 2. class value parameters
// it can var or val however your use-case might be. You can eliminate the
// constructor keyword if it doesnt have a

class Person2(var name: String){

}

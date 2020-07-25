package ClassesObjects

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
    var fullName = name + "Dummy LastName"

    // init blocks are just after the primary constructors and you can use
    // them to initialize a variable or anything else which you were not able
    // to do in the primary constructor.
    init{
        println("We declared FullName")
        // println("We dont have access to $someOtherVariable here.")
    }

    // you can declare variables anywhere in the class and it will load
    // and get initialized according to the position you declared them in.
    var someOtherVariable = 2

    // this init block was called after the someOtherVariable declaration
    init {
        println("The other declared variable is $someOtherVariable")
    }
}

// Official way of having multiple constructors for kotlin classes.
// i dont completely understand how this system works. The official reference
// says you have to call the primary constructor from the secondary constructor
// but it works just fine even if you dont so i dont know how it is supposed to
// be done maybe someone can help me out with it.
class Human(val name: String) {
    var children: MutableList<Human> = mutableListOf<Human>()
    constructor(someName: String, parent: Human) : this(someName) {
        parent.children.add(this)
    }
}
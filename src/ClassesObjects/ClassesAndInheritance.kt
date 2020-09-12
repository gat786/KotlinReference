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

        //var p3 = Person3("ganesh",21)
        var constructors = Constructors(2)
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
// You can have as many constructors as you wish.
// declaring them is also as same as primary constructors using the constructor
// keyword. It is mandatory to delegate to the primary constructor from each
// secondary constructor using the `this` keyword. if you forget to do this the
// code wont compile.

class Person3(val name: String) {
    var children: MutableList<Person3> = mutableListOf<Person3>()

    constructor(name: String, number: Int):this(name){
        println("Secondary constructor")
    }
}

// this class is here to showcase that init blocks are called after the primary
// constructors so any secondary constructor will run after it. You can think
// of it that it becomes the part of primary constructor and gets attached to
// its end.

class Constructors {
    init {
        println("Init block")
    }

    constructor(i: Int) {
        println("Constructor")
    }
}
//
//  Classes can contain:
//  Class members
//
//  Constructors and initializer blocks
//  Functions
//  Properties
//  Nested and Inner Classes
//  Object Declarations
//
//  we have already looked at constructors now lets look at others.
// lets introduce inheritance as well.
// all classes normally are final i.e. they cant be inherited.
// if you want your class to be inherited make it open by specifying. the
// `open` specifier before class declaration

// the below code wont work with the first declaration of Vehicle class
// but will work with the open declaration of the Vehicle class
// btw to inherit a class you just do `:parentclassname()` after the derived
// class declarations first line before starting its body.

//class Vehicle{ }

open class Vehicle{}

class Car :Vehicle(){}

// its necessary to initialize the base class as you soon as you infer it in
// the child class.

open class Base(p: Int){
    constructor(p: Int,q: Int):this(p){}
}

class Derived(p: Int) : Base(p)

// if your derived class doesnt have a primary constructor then you will have
// initialize the parent class using the super keyword after each constructor
// that you have in the derived class.

class MoreDerived:Base{

    constructor(p:Int):super(p){}

    // here i can use any of the constructors of the base class.
    // which wouldn't have been possible in the `Derived` class.
    constructor(p:Int,q:Int):super(p,q){}
}

// Overriding methods.
// You can override the functions from the base class in the derived class
// using override keyword.

open class Automobile{
    open fun move(){
        println("I move")
    }
}

class Aeroplane:Automobile(){
    override fun move(){
        println("I move very fast")
    }
}
package ClassesObjects

class ClassesAndInheritence {

}

class Empty

class WithPrimaryConstructor constructor(name:String,
                                         var numericalValue:Int){
    init {
        // name = "Something Else"
        numericalValue = 3
    }
}

class WithMultipleConstructors{
    var firstNumber : Int? = null
    var secondNumber : String? = null

    constructor(number: Int){
        firstNumber = number
        secondNumber = firstNumber.toString()
    }

    constructor(number:String){
        firstNumber = number.toInt()
        secondNumber = number
    }
}
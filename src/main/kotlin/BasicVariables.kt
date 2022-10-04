class BasicVariables {

    fun readOnlyVariable(){
        // variable declare with val are immutable i.e values can't be changed once intialised
        val age:Int = 27
        val name:String = "Shrikant"
        println("My name is $name and i am $age years old")
    }


    fun mutableVariables(){
        // variable declared with var are mutable that can be changed in at point of time
        var age:Int = 27
        println("My age was $age,5 years ago")
        age=32
        println("Now I am $age years old")
    }
}
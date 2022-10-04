class BasicSealedClass {

    // Sealed Class let you to retrict the use of inheritance.Sealed class can only be in subclass of smae package.
    // It can not be access outisde of subclass

    sealed class Mammal(val name:String)

    private class Cat(val catName:String):Mammal(catName)
    private class Human(val humanName:String,val job:String):Mammal(humanName)


   private fun greetMammal(mammal: Mammal):String{
        when(mammal){
            is Human -> return "Hello ${mammal.name}; You're working as a ${mammal.job}"
            is Cat -> return  "Hello ${mammal.name};"
        }
    }

    public fun helloMammal(){
        println(greetMammal(Cat("Snowy")))
        println(greetMammal(Human("Shrikant","Developer")))
    }

}
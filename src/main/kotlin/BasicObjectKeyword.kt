import java.util.*

class BasicObjectKeyword {

    // Class and object work same as other oops language.A class is blueprint and object are instance of that class
    //there can multiple instance of class

    // Basic Class instance with fun
    fun getRandomNumber() {
        var randomNumber= Random()
        println(randomNumber.nextInt(90))

    }


    // Object can structured with single object
    fun rentPrice(regularPrice:Int,discountPrint:Int,festivalPrice:Int):Unit{
        val rate=object {
            var ragular:Int=10*regularPrice
            var discount:Int=30*discountPrint
            var festival:Int=50*festivalPrice
        }

        val totalPrice=rate.ragular+rate.discount+rate.festival
        println("Total Price You Paid : $totalPrice")
    }


    // Companion Object
    //This are similar to static mathods in java object can call using class name as qualifier

    // Method getname() can be call with class name
    companion object Name{
        fun getName(name:String){
            println("Welcome $name")
        }
    }


}


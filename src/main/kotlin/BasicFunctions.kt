class BasicFunctions {

    ///-------------High-order Function-------------------

    fun  cal(x:Int,y:Int,operation:(Int,Int)->Int):Int{
        return operation(x,y)
    }

    fun add(a:Int,b:Int)=a+b

    // Here you can use add fun in cal as parameter as
    // cal(5,10,::add)
    // OR With custome fun like
    // cal(5,10,{a,b->a*b}



    ///-------------Fun returning other function-------------------

    fun sum(): (Int, Int) -> Int {
        return ::add
    }

    // Now you can call like this
    // val funct=sum()
    // funct(2,5)


    ///-------------------Lamda Function------------------------
    // Lamda function are simple way to create functions ad-hoc.We can perform some basic operation using lambda fun
    // in simplest way
   // * Ad hoc functions perform ad hoc operations such as zooming, retrieving and submitting data, and pivoting

    // All these are different form of lamda functions
    val upperCase1:(String)->String={str:String -> str.uppercase()}
    val upperCase2={str:String -> str.uppercase()}
    val upperCase3:(String) ->String ={it.uppercase()}
    val upperCase4:(String) ->String =String::uppercase



    ///-------------------Extension Function------------------------


    data class Item(
        val name:String,
        val price:Float
    )

    data class Order(val items:Collection<Item>)

    fun Order.minPricedItemPrice():Float=this.items.minByOrNull { it.price }?.price?: 0F

    fun Order.minPricedItemName():String=this.items.minByOrNull { it.name }?.name?:"No Products"

    val Order.ItemName:String get() = items.map { it.name }.joinToString()

    fun showOrder(){
        val order=Order(listOf(Item("Bread",20.0f),Item("Milk",40.0f),Item("Butter",25.0f)))
        println("Min Price Item Name is : ${order.minPricedItemName()}")
        println("Min Price Item Value is : ${order.minPricedItemPrice()}")
        println("Item : ${order.ItemName}")
    }







}
class BasicsFunction {

    // Function Declation with args
    fun math(a:Int,b:Int):Int{
        return a+b;
    }

    // Function with specific  type
    fun addTypeOne(a: Int,b: Int):Unit{
        println("Program arguments: ${add(a,b)}")
    }

    // Function with body can be expression
    fun add(a:Int,b: Int)=a+b
}
class BasicLoops {
    val fruits = listOf<String>("banana", "avocado", "apple", "kiwifruit")
    fun forLoops() {

        //for loop with item
        for (item in fruits) {
            println("Fruits-> $item")
        }
    }

    fun forLoopWithIndex(){
        //for loop with index
        for (index in fruits.indices){
            println("Fruits-> ${fruits[index]} at index $index")
        }
    }

    fun whileLoops(){
        var index=0
        while (index<fruits.size){
            println("Fruits-> ${fruits[index]} at index $index")
            index++
        }
    }

    fun whenLoopWithExpression(){
        var userInput= readLine()
        when (userInput){
            "1"->println("One")
            "Hello"->println("Hi")
            else -> println("Greeting From Shrikant")
        }
    }

    fun loopsWithRange(){
        val x=10
        val y=9
        if(x in 1..y+1){
            println("x is in range of y")
        }
    }


    fun filterAndLoop(){
        fruits.filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.uppercase() }
            .forEach{println(it)}
    }


}
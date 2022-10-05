class BasicCollection {
    ///-------------------List------------------------

    //Two type of List
    // 1) Mutable List :- Values can be change
    // 2) List :- value can not be change once values are added.List are also called ready-only

    val systemuser : MutableList<String> = mutableListOf("Shrikant","Dev","John")
    val sudoers : List<String> = systemuser


    fun addSystemUser(newuser:String)=systemuser.add(newuser)

    fun getSysUser():List<String>{
        return sudoers
    }

    // addSystemUser("Test User")
    //        println("Total Size of Sysuser : ${getSysUser().size}")
    //        getSysUser().forEach{
    //                user -> println("Sysuser in list  : $user")
    //        }

    ///-------------------Set------------------------
    // Set are unorder collection with no duplicates.
    // When duplicate vaules are add it give error

    val users : MutableSet<String> = mutableSetOf("Shrikant","Dev","John")

    fun addUser(user : String )= users.add(user)

    // Output of below line will 1st line will false as Shrikant is in list whereas in 2 it will be true
//    println(addUser("Shrikant"))
//    println(addUser("Sree"))




    ///-------------------Filter------------------------

    val number= listOf(1, -2, 3, -4, 5, -6)
    // for positive number
    val positive=number.filter { x-> x > 0 }
    val nagative=number.filter { x-> x < 0 }
    val max=number.max()
    val min=number.min()



    ///-------------------Map------------------------
    val squareOfNumber=number.map { x -> x * x }
    val item=number.map { x -> x }


    ///-------------------any all none------------------------
    // Any check at least one element matches condition
    // All check all element matches condition
    // None check No element matches condition

     val anyNagative=number.any { x -> x < 0 }
     val isAllNagative=number.all { x -> x < 0 }
     val AllareNagative=number.none { x -> x < 0 }

    ///-------------------find and finlast------------------------
    val words = listOf("Lets", "find", "something", "in", "collection", "somehow")  // 1
    val firstword=words.find { it.startsWith("some") }
    val lastWord=words.findLast { it.startsWith("some") }


    ///-------------------count------------------------

    val totalCount=number.count()
    val totalPositiveCount=number.count{ it>0 }

    ///-------------------associateBy, groupBy------------------------
    // With associatedBy we can filter list with key
    // Assosicate will return list with group of city with same  name
    // Group will show only two filed name and city

    data class Person(val name: String, val city: String, val phone: String)

    val people = listOf(
        Person("John", "Boston", "+1-888-123456"),
        Person("Sarah", "Munich", "+49-777-789123"),
        Person("Svyatoslav", "Saint-Petersburg", "+7-999-456789"),
        Person("Vasilisa", "Saint-Petersburg", "+7-999-123456"))

    val cityBook=people.associateBy { it.city }
    val cityBook1=people.groupBy( Person::city, Person::name )


    ///-------------------Partition------------------------
    // Array can be seperated with pair
    val evenNumber=number.partition { it%2==0 }

    // Also we destructure like
    //val (evenNumber,oddNumer)=number.partition { it%2==0 }

    fun printList(){

        println("All Even Numbers  $evenNumber")


    }
}
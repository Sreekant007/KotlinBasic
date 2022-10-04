class BasicDataClasses {

    // Data Class are used to store value,this type of class provides getter,settter automatically

    data class User(val name:String,val id:Int){
        override fun equals(other: Any?) =
            other is User && other.id==this.id

    }

    fun dataClassOperation(){
        val firstUser=User("Shrikant",1)
        println("User $firstUser is created")
        val secondUser=User("Max",1)
        val thirdUser=User("Test",2)

        // hashcode will return hash value of user
        println(firstUser.hashCode())

        // copy will copy same user again
        println(firstUser.copy("Max"))


    }
}
class BasicEnum {

    // Enum class are used for model type that respresent state,distinct value or any modes

    // Simple enum class with constants
    enum class STATE{
        IDLE,RUNNING,FINISHED
    }

    enum class COLORS(val rbg:Int){
        RED(0xFF0000),
        GREEN(0x00FF00),
        BLUE(0x0000FF),
        YELLOW(0xFFFF00);

        fun containsRedColor()=(this.rbg and 0xFF0000 !=0)
    }

    fun printState(){
        val currentState=STATE.IDLE
        when(currentState){
            STATE.IDLE-> println("Process is in IDLE State")
            STATE.RUNNING-> println("Process is in RUNNING State")
            STATE.FINISHED-> println("Process is in FINISHED State")
        }
    }

    fun printStateOne(){
        val colorRed=COLORS.RED
        println(colorRed)
        println(colorRed.containsRedColor())
        println(COLORS.BLUE.containsRedColor())
    }
}
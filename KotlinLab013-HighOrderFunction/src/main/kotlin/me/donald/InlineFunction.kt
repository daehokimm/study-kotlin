package me.donald

fun main() {
    val array = arrayOf(11, 2, 3)
    fun arrayLoop(array: IntArray) {
        array.forEach {
            if(it < 0) return@forEach
            println(it)
        }
        println("loop end")
    }

    fun arrayLoop() {
        array.forEach {
            if(it < 0) return@forEach

            println(it)
        }
        println("loop end")
    }

    arrayLoop(array.toIntArray())
    arrayLoop()
}
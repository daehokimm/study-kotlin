package me.donald

/**
 * 변수 초기화 - 정상
 */
val topData1: Int = 10
var topDate2: Int = 10

class User2 {
    val objData1: String = "data1"
    var objData2: String = "data2"

    fun some() {
        val localData1: Int = 10
        var localData2: String

        println(localData1)

        localData2 = "hello"
        println(localData2)
    }
}
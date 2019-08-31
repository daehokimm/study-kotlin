package me.donald

import java.util.HashMap

/**
 * 콜렉션 타입
 * - 가변 콜렉션과 불가변 콜렉션 존재
 * - 가변 콜렉션 클래스가 불가변 콜렉션 클래스를 상속하는 형태
 * - 자바의 콜렉션도 사용 가능
 */
fun main(args: Array<String>) {
    val immutableList: List<String> = listOf("hello", "world")
    println("${immutableList[0]} .. ${immutableList[1]}")

    val mutableList: MutableList<String> = mutableListOf("hello", "world")
    mutableList.add("donald")
    mutableList.set(0, "Greeting")      // mutableList[0] = "Greeting" 과 동일
    println("${mutableList[0]} .. ${mutableList[1]} .. ${mutableList[2]}")

    // ArrayList 클래스로 생성 가능 - 가
    val arrayList: ArrayList<String> = ArrayList()
    arrayList.add("hello")
    arrayList.add("donald")
    arrayList[1] = "world"
    println("${arrayList[0]} .. ${arrayList[1]}")

    // 자바 콜렉션 사용
    val javaMap: HashMap<String, String> = HashMap()
    javaMap.put("k1", "hello")
    javaMap["k2"] = "Kotlin"
    println("${javaMap["k1"]} .. ${javaMap["k2"]}")
}
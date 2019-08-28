package me.donald

/**
 * 변수 타입 추론
 * - 변수 선언에 대하여 타입을 명시하지 않더라도 초기화 값을 이용하여 타입 추론 가능
 */
var data1 : Int = 10
var data2 = 20      // Int로 타입 추론
val data3 = 30

fun main(args: Array<String>) {

    data2 = 40      // 변경 가능
//    data3 = 40    변경 불가
}


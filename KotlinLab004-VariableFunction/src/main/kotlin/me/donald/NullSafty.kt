package me.donald

/**
 * Null 안정성
 * - null이 가능하다는 명시('?')를 해줘야 null 값 가능
 */
//val nonNullData: String = null    nullable('?') 명시 에러
val nullableData1: String? = null
var nullableData2: String? = null

fun main(args: Array<String>) {
//    nullableData1 = "hello"       Read-Only 에러
    nullableData2 = "hello"
}
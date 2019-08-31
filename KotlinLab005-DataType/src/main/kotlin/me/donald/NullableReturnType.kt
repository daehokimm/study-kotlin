package me.donald

/**
 * null 허용 반환 타입 함수
 * - 반환 타입 뒤에 '?'를 명시해서 함수의 반환에 null이 가능하다는 것을 명시
 */
fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun main(args: Array<String>) {
    println(parseInt("1000"))
    println(parseInt("donald"))     // null
}
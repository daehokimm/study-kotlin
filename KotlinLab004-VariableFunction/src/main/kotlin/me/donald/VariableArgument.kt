package me.donald

/**
 * 가변 인수
 * - 함수 오버로딩을 축약하기 위한 형태.(ex. 동일 이름의 함수 인수의 수가 1개, 2개, ..., 10개인 경우)
 * - 제네릭을 이용.
 */
fun <T> varargsFun(a1: Int, vararg array: T) {
    for (a in array) {
        println(a)
    }
}

fun main() {
    varargsFun(10, "hello", "world!!")
    varargsFun(10, 20, false)
}
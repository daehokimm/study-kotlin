package me.donald

/**
 * 문자열 템플릿
 * - 문자열 내부에서 '$' 기호로 문자열 내에 변수 데이터나 특정 연산식의 결과를 포함할 수 있음
 */
fun sum(no: Int): Int {
    var sum = 0
    for (i in 1..no) {
        sum += i
    }
    return sum
}

fun main(args: Array<String>) {
    val name: String = "donald"
    println("result : $name .. ${sum(10)}")
}
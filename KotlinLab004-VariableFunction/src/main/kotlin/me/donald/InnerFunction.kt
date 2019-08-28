package me.donald

/**
 * 인라인 함수
 * - 함수 내에서 함수 선언 가능
 */
fun sum(a: Int, b: Int): Int {
    var sum = 0
    fun calSum(){           // 함수 내에 함수 정의 가능
        for (i in a..b)
            sum += i
    }
    calSum()
    return sum
}

fun main(args: Array<String>) {
    val result = sum(1, 10)
    println(result)
}
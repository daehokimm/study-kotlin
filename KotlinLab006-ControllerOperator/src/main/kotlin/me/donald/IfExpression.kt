package me.donald

/**
 * if
 * - 표현식(데이터 발생)으로 사용 가능
 * - 표현식으로 사용할 경우 else 구문 반드시 필요
 */
fun main(args: Array<String>) {
    val a : Int = 10

    val result = if (a > 10) "hello" else "world"       // 값 발생 - 표현식으로 사용
    println(result)

    val result2 = if(a < 10) {
        print("hello ..")
        10 + 20
    } else {
        print("world .. ")
        11 + 22
    }
    println(result2)
}
package me.donald

/**
 * while
 * - 자바 while 과 동일
 */
fun main(args: Array<String>) {
    var x = 0
    var sum = 0
    while (x < 10)
        sum += x++

    println(sum)
}
package me.donald

/**
 * for
 * - 'in' 뒤에 범위
 * - collection.indices 는 콜렉션의 인덱스가 범위
 * - collection.withIndex 는 콜렉션의 인덱스와 값이 동시에 범위
 * - 'until' 은 ~미만
 * - 'step' 은 홉의 크
 */
fun main(args: Array<String>) {
    var list = listOf("hello", "world", "!")

    for (str in list)
        print("$str .. ")
    println()

    for (i in list.indices)
        print("${list[i]} .. ")
    println()

    for ((idx, v) in list.withIndex())
        print("$idx/$v .. ")
    println()

    for (i in 1 until 10 step 2)
        print("$i .. ")
    println()
}
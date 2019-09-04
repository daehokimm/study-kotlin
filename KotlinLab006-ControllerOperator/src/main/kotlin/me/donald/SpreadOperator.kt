package me.donald

/**
 * '*' : 전개 연산자
 * - 배열값을 전개하여 반환함
 * - 오직 배열만 가능1
 */
fun main(args: Array<String>) {
    val array = arrayOf(10, 20, 30)     // Integer로 변환
    someSpread1(*array)

    someSpreadInt(*array.toIntArray())
    someSpreadInteger(*array)

    val intArrayOf = intArrayOf(10, 20, 30) // int로 변환
    someSpread1(intArrayOf)

    val list = listOf(1, 2, *array, 100, 200)
    someSpread1(*list.toTypedArray())

    val array2 = arrayOf("hello", "world")
    someSpread2(*array2)
}

fun someSpreadInt(vararg arg: Int) {        // int로 변환
    arg.forEach { a -> println(a) }
}

fun someSpreadInteger(vararg arg: Int?) {   // Integer로 변환
    arg.forEach { a -> println(a) }
}

fun <T> someSpread1(vararg arg: T) {        // 제네릭 타입
    arg.forEach { a -> println(a) }
}

fun someSpread2(vararg arg: String) {        // 고정 타입
    arg.forEach { a -> println(a) }
}


package me.donald

/**
 * '*' : 전개 연산자
 * - 배열값을 전개하여 반환함
 * - 오직 배열만 가능1
 */
fun main(args: Array<String>) {
    val array = arrayOf(10, 20, 30)
    someSpread(*array)

    val list = listOf(1, 2, *array, 100, 200)
    someSpread(*list.toTypedArray())

    val array2 = arrayOf("hello", "world")
    someSpread(*array2)
}

fun<Int> someSpread(vararg arg: Int) {
    arg.forEach { a -> println(a) }
}

fun someSpread(vararg arg: String) {        // 가변 인수 기본 값은 String?
    arg.forEach { a -> println(a) }
}
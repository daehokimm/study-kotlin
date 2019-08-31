package me.donald

/**
 * Any 타입
 * - 코틀린 클래스의 최상위 클래스가 Any
 * - 자바의 Object
 */
fun getLength(obj: Any): Int {
    if(obj is String) {         // is : 타입 점검 연산자, 자동으로 String으로 캐스팅(스마트 캐스팅)
        return obj.length
    }
    return 0
}

fun cases(obj: Any): String {
    return when(obj) {          // Switch 문과 유사
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a String"
        else -> "unknown"
    }
}

fun main(args: Array<String>) {
    println(getLength("Hello donald!"))
    println(getLength(10000))

    println(cases(1))
    println(cases(10L))

}
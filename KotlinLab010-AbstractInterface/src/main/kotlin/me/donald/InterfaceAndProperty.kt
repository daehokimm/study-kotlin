package me.donald

/**
 * 인터페이스와 프로퍼티
 * - 인터페이스에 프로퍼티를 정의할 때 규칙
 * -- 1. 추상형으로 선언
 * -- 2. 추상 프로퍼티가 아니면 val 는 get() 함수를 꼭 선언
 * -- 3. 추상 프로퍼티가 아니면 var 는 get(), set() 함수 꼭 선언
 * -- 4. 인터페이스의 프로퍼티를 위한 get(), set() 함수 내에서 `field` 를 사용할 수 없음
 * - field 사용은 할 수 없지만 로직은 추가 가능
 */
interface MyInterface {
    var prop1: Int  // 추상형 선언

//    val prop2: String = "donald"      // 에러

//    val prop3: String       // 에러
//        get() = field

//    var prop4: String         // 에러
//        get() = "donald"

    val prop5: String
        get() = "donald"

    var prop6: String
        get() = "donald"
        set(value) {

        }

    var prop7: Int
        get() = 0
        set(value) {
            if (value > 10)
                calcSome(value)     // 로직 추가
        }

    fun calcSome(value: Int)
}

fun main(args: Array<String>) {
    println("Hello, World")
}


package me.donald

/**
 * val은 상수가 아니다.
 * - val는 get() 함수를 정의함에 따라 표현이 달라질 수 있다. (--> 상수가 아니다)
 */
var myBool = false
val myVal: String = "hello"
    get() {     // myVal의 get 함수. get 함수를 어떻게 처리하느냐에 따라 value 도 다른 값이 나오게 할 수 있다.
        if (myBool)
            return field
        else
            return field.toUpperCase()
    }

fun main(args: Array<String>) {
    println(myVal)
    myBool = true
    println(myVal)
}
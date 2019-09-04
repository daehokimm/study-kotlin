package me.donald

/**
 * infix : 중위 표현식
 * - '+' 연산자처럼 infix로 선언된 함수는 중위 표현식으로 사용 가능
 * - infix 함수는 클래스의 확장 함수거나 멤버 함수로 선언 가능
 */
// 중위 표현식에 사용되는 함수 선언 가능
infix fun Int.myFun(x: Int): Int = x * x

data class Test(val i : Int)
infix fun Test.myFun(x: Int): Int = x * x

// infix 함수는 클래스의 확장 함수이거나 클래스의 멤버 함수로 선언 가능
infix fun FunClass.myFun(x: Int): FunClass = FunClass()

class FunClass {
    infix fun infixFun(a: Int) {
        println("infixFun call...")
    }
}

fun main() {
    val obj = FunClass()
    obj.infixFun(10)    // 일반 함수 호출
    obj infixFun 10        // 중위 표현식

    println(10 myFun 10)
    println(10.myFun(10))

    println(Test(1).myFun(10))
}
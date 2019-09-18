package me.donald

fun hoFun(num: Int, argFun: (Int) -> Int) {
    println("${argFun(num)}")
}

fun hoFun1(argFun: (Int) -> Int) {
    println("${argFun(99)}")
}

fun hoFun2(no: Int, argFun1: (Int) -> Int, argFun2: (Int) -> Boolean) {

}

fun hoFun3(
    no: Int = 10,
    argFun1: (Int) -> Int = { x: Int -> x * x },        // 매개변수 함수도 기본값으로 설정 가능
    argFun2: (Int) -> Boolean = { x: Int -> x > 10 }
) {
    val result = argFun1(no)
    println("result : ${argFun2(result)}")
}

fun main() {
    hoFun(num = 10, argFun = { x -> x * x })

    hoFun1 { x -> x * x }        // () 생략 가능

    hoFun2(10, { it * it }, { it > 10 })
    hoFun2(10, { it * it }) { it > 10 }
//    hoFun2(10,) { it * it }, { it > 10 })     // 에러

    hoFun3()    // 기본 값들로 대체
}


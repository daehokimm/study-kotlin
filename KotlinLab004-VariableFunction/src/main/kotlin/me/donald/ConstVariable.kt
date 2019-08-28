package me.donald

/**
 * const : 상수 변수
 * - 상수 변수는 최상위 레벨에서'만' 선언 가능
 */
const val myConst: Int = 10
//const var myConst2: Int = 10      const 는 var 를 사용할 수 없음

class MyClass {
//    const val myConst3 = 30       const 는 클래스나 함수에서 선언 불가
}

fun some() {
//    const val myConst4 = 40       const 는 최상위 레벨로 선언하거나 object로 선언한 클래스에서만 사용 가능
}
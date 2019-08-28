package me.donald

/**
 * 함수 선언
 * - 함수 선언은 fun 키워드와 함께 다음과 같이 선언할 수 있음.
 * - 이름, 인자, 반환 타입 순으로 명시하는 것이 특징
 * - 반환 값이 없는 경우 'Unit'으로 명시하며, 생략 가능
 * - 하나의 라인으로 구성된 함수인 경우 중괄호 생략 후 선언 라인에 함께 명시하여 선언 가능. (타입 추론도 가능)
 */
fun sumInt(a: Int, b: Int): Int {
    return a + b
}

// 반환 값이 없는 경우 Unit
fun sumUnit(a: Int, b: Int): Unit {

}

fun someOneLine(a: Int, b: Int): Int = a + b

fun someOneLineWithoutType(a: Int, b: Int) = a + b
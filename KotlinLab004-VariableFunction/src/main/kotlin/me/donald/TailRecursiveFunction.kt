package me.donald

/**
 * tailrec : 꼬리 재귀 함수
 * - 컴파일 시 반복문으로 변경되기 때문에 StackOverFlow 에러를 방지할 수 있음.
 * - 자신을 다시 호출하는 구문은 함수의 맨 마지막 작업으로 작성되어야 함. (--> '꼬리' 재귀 함수)
 * - 재귀 호출이 맨 마지막 작업이 아니어도 컴파일은 되지만, 반복문으로 변경되지 않음.
 */
tailrec fun tailrecPrint(no: Int = 1, count: Int = 1) {
    println("tailrec call")
    return if (no <= count) return else tailrecPrint(no - 1, count)
}

fun main() {
    tailrecPrint(5)
}
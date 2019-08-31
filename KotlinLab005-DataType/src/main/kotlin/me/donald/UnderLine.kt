package me.donald

/**
 * 밑줄 추가
 * - 숫자(Number) 타입의 숫자 값에는 가독성을 위해 '_' 추가 가능
 * - 값 자체에는 영향 x
 */
val oneMillion : Int = 1_000_000

fun main() {
    println(oneMillion)     // 1000000 으로 출력
}
package me.donald

/**
 * 숫자 타입
 * - 코틀린의 모든 숫자 타입은 Number 클래스의 서브 클래스
 * - 자동 형변환 지원 x
 * - 모두 객체 형태 (기본형 x)
 */
val a3: Byte = 0b00001011
val a4: Int = 123
val a5: Int = 0x0F
val a6: Long = 10L
val a7: Double = 10.0
val a8: Double = 123.5e10
val a9: Float = 10.0f

fun main() {
    println(a3)
    println(a4)
    println(a5)
    println(a6)
    println(a7)
    println(a8)
    println(a9)
}
package me.donald

/**
 * 기본 타입의 캐스팅
 * - 코틀린에서는 기본 타입의 자동 캐스팅을 지원하지 않음
 * - .toXXX 를 통해 캐스팅해줘야 함
 * - 값의 캐스팅은 자동적으로 이뤄짐
 */
var a1: Int = 10
var a2: Double = a1.toDouble()

var l: Long = 1L + 3        // 값의 자동 형 변환
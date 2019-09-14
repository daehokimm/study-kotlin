package me.donald

/**
 * 상속과 생성자
 * - 하위 객체 생성 시, 어떤 식으로든 상위 클래스의 생성자가 호출되어야 함
 * - 상속과 생성자 호출 순서 규칙
 * -- 1. `this()` 혹은 `super()`에 의한 다른 생성자 호출
 * -- 2. `init` 블록 호출
 * -- 3. 생성자 블록 실행
 *
 */
// 주 생성자가 사용된 상속
open class Super1(name: String) {
    init {
        println("[Super-1] init... name : $name")
    }
}

class Sub1(name: String) : Super1(name) {
    constructor(name: String, no: Int) : this(name) {   // 주 생성자가 선언되어 잇다면, 보조 생성자는 `this()`로 주 생성자와 연결 되어야 함
        println("[Sub-1] name : $name, no : $no")
    }
}

// 보조 생성자가 사용된 상속
open class Super2(name: String) {
    constructor(name: String, no: Int): this(name) {
        println("[Super-2] name : $name, no : $no")
    }
}

class Sub2 : Super2 {
    constructor(name: String) : super(name) {}  // 상위 클래스의 주 생성자 호
    constructor(name: String, no: Int) : super(name, no) {
        println("[Sub-2] name : $name, no : $no")
    }
}

fun main() {
    val sub1 = Sub1("donald", 28)
    val sub2 = Sub2("donald", 28)
}
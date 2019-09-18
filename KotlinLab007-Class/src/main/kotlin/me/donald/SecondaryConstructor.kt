package me.donald

/**
 * 보조 생성자
 * - `constructor` 예약어로 선언 가능
 * - 주 생성자 없이 보조 생성자만 선언 가능
 * - 보조 생성자만 선언한 경우, init 함수는 의미 없음
 * - 보조 생성자 파라미터에서는 `var`, `val` 같이 변수 선언 불가능
 * - 주 생성자와 보조 생성자를 함께 사용하는 경우, 보조 생성자에서 주 생성자를 호출해야함
 * -
 */
class User4 {
    init {
        println("init !!!")
    }

    constructor() {
        println("constructor !!!")
    }
}

class User5(name: String) {
    init {
        println("init!! : $name")
    }

    constructor(name: String, age: Int): this(name) {
        println("constructor : $name, $age")
    }
}

fun main(args: Array<String>) {
    val user4 = User4()

    val primaryConstructor = User5("donald")
    val secondaryConstructor = User5("donald", 28)
}
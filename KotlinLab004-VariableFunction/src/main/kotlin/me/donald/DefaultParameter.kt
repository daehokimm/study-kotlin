package me.donald

/**
 * 기본 인자
 * - 함수의 인자에 기본 값을 지정할 수 있음
 */
// 기본 인자 값으로 "donald" 지정
fun sayHello(name: String = "donald") {
    println("Hello! $name")
}

/**
 * 명명된 인자 (named argument)
 * - 함수 호출 과정에서 함수의 인자를 선언된 이름으로 지정할 수 있음.
 */
fun sayHello(name: String = "donald", no: Int = 10) {
    println("I Love you $name, $no times")
}

fun main(args: Array<String>) {
    // 기본 인자
    sayHello()
    sayHello("Daeho!")

    // 명명된 인자
    sayHello("tony", 3000)
    sayHello(no = 50)

    // * 기본 인 함수로 호출됨
    sayHello(name = "daddy")
}

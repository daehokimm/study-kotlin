package me.donald

/**
 * 주 생성자
 * - 클래스 헤더로 주 생성자 선언
 * - 파라미터에 기본 값 설정 가능
 * - `init` 함수는 초기화 함수
 * - `val`, `var`로 파라미터를 변수로 선언 가능 (클래스 내부 함수에서 사용 가능)
 */
class User1(name: String, age: Int = 10) {}

class User2(val name: String, val age: Int) {
    init {
        println("init!! - name : $name // age : $age")
    }

    fun sayHello() {
        println("hello~ - name : $name // age : $age")
    }
}

fun main(args: Array<String>) {
    val user1 = User1("donald")

    val user2 = User2("donald", 28)
    user2.sayHello()
}
package me.donald

/**
 * 클래스 프로퍼티
 * - 클래스 내부의 프로퍼티는 `var`의 경우 getter/setter 모두, `val`의 경우 getter 함수를 가진다.
 *
 */
class User {
    var name: String = "donald"
        get() = field
        set(value) {
            field = value
        }

    val age: Int = 28
        get() = field
}

fun main(args: Array<String>) {
    val user = User()

    user.name = "kim"
    println("name : ${user.name}")
    println("age : ${user.age}")

}


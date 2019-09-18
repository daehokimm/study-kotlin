package me.donald

/**
 * 다양한 고차 함수
 * - run() : 객체에 직접 접근. 반환 값 있음
 * - apply() : run()과 유사. 반환 값 없음
 * - let() : 객체 생성과 함께 접근 가능
 * - with() : run()과 유사하지만, 매개변수로 객체를 받음
 */
class User {
    var name: String? = null
    var age: Int? = null

    fun sayHello() {
        println("hello $name")
    }

    fun showInfo() {
        println("name : $name // age : $age")
    }
}

fun whoIs(user: User) {
    user.showInfo()
}

fun main() {

    println("==== run() ====")
    // 기존 방법
    val donald = User()
    donald.name = "donald"
    donald.age = 29
    donald.sayHello()
    donald.showInfo()

    // run 이용
    donald.run {
        name = "daeho"      // 바로 접근 가능!!
        age = 28
        sayHello()
        showInfo()
    }

    donald.showInfo()

    println("==== apply() ====")
    val applyResult = donald.apply {
        name = "very_nerd_boii"
        age = 0
        sayHello()
        showInfo()
    }
    println("${applyResult is User}")       // User 객체 반환

    println("==== let() ====")
    User().let { user ->        // 변수 지정하지 않고, 바로 접근
        user.name = "kim"
        user.age = 30

        whoIs(user)
    }

    println("==== with() ====")
    with(donald) {      // 매개변수로 객체 값
        name = "why is so many name"
        age = 10000

        sayHello()
        showInfo()
    }
}
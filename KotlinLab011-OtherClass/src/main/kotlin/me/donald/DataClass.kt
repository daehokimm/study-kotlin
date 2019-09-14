package me.donald

/**
 * 데이터 클래스
 * - VO
 * - 데이터 클래스의 equals() 함수는 값 비교
 * - `componentN`으로 N 번째 프로퍼티에 접근 가능
 * - `copy()` 는 대상 객체의 일부분만 바꿔서 복사 가능
 */
data class User(var name: String, var age: Int)

data class UserReplica(var name: String, var age: Int)

fun main() {
    val user1 = User("donald", 28)
    val user2 = User("donald", 28)

    println("==== equals() ====")
    println("init : ${user1.equals(user2)}")

    user2.age = 29
    println("1 age old : ${user1.equals(user2)}")

    val userReplica = UserReplica("donald", 28)
    println("replica class : ${user1.equals(userReplica)}")

    println("==== toString() ====")
    println(user1.toString())

    println("==== componentN() ====")
    println("${user1.component1()} // ${user1.component2()}")

    val (name, age) = user1
    println("$name // $age")

    println("==== copy() ====")
    val user3 = user1.copy(name = "kim")
    println("user 3 : $user3")
}


package me.donald

/**
 * 프로퍼티 초기화
 * - 프로퍼티는 즉시 초기화하지 않고 다양한 방법으로 초기화할 수 있다.
 * - `init` 함수로 프로퍼티 초기화 가능
 * - `null` 허용 선언 및 생성자 초기화 방식으로 프로퍼티 초기화
 * - `lateinit` (늦은 초기화) 방식으로 초기화 (단, var만 가능, 주 생성자 불가, 사용자 정의 getter/setter 정의하지 않았을 경우, null 허용 타입이 아닌 경우, 기초 타입 프로퍼티가 아닌 경우)
 * - `by lazy`으로 프로퍼티 사용 시점에 초기화 하기(단, val만 가능, 클래스 몸체 이외에 최상위 레벨에서 사용 가능, 기초 타입에도 사용 가능)
 * - 즉시 초기화 하지 않는 경우 : DI 등 ...
 */
class User1 {
    var data: String
    val data2: Int

    init {
        data = "donald"
        data2 = 10
    }
}

class User2 {
    lateinit var lateDate: String
}

val someData: String by lazy {
    println("some data lazy...")
    "hello"
}

class User3 {
    val name: String by lazy {
        println("name lazy...")
        "donald"
    }

    val age: Int by lazy {
        println("age lazy...")
        10
    }

    init {
        println("init ...")
    }

    constructor() {
        println("constructor ...")
    }
}

fun main() {
    val user2 = User2()
    user2.lateDate = "hello"
    println("${user2.lateDate}")

    val user3 = User3()
    println("name before")
    println("name : ${user3.name}")
    println("name after")
    println("age before")
    println("age : ${user3.age}")
    println("age after")
}
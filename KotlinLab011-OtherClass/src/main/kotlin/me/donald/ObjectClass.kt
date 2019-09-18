package me.donald

/**
 * object
 * - 익명 함수의 형태
 * - 클래스 내부에서 `companion`과 함께 선언하면 외부 클래스에서 자바의 static 선언 형태로 접근 가능
 * - 클래스로 선언하면 싱글톤 클래스로 선언됨
 */
val obj1 = object {
    var no1: Int = 10
    fun ob1Print() {
        println("$no1")
    }
}

class Some {
    private var no: Int = 0

    private val myInner = object {
        val name: String = "donald"
        fun innerFun() {
            println("innerFun...")
        }
    }

    companion object NestedClass {
        val no: Int = 0
        fun myFun() { }
    }

    fun outerFun() {
        println(myInner.name)
        myInner.innerFun()
    }
}

object SingletonClass {
    fun myFun() { }
}

fun main() {
    val some = Some()
    some.outerFun()

//    val singletonClass = SingletonClass()     // 에러
    SingletonClass.myFun()

    Some.no
}
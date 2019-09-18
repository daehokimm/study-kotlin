package me.donald

/**
 * Nested 클래스
 * - 자바의 inner 클래스와 유사
 * - 내부 클래스에서 외부 클래스의 프로퍼티, 함수에 접근하려면 내부 클래스 선언 시 `inner` 명시
 * - `inner` 명시 시, 내부 클래스의 직접 할당 불가능 -> 외부 클래스의 함수를 통해 할당 가능
 */
class Outer {
    var no: Int = 10
    fun outPrint() {
        println("${this.no}")
    }

    inner class Nested {
        val name: String = "donald"
        fun nestedPrint() {
            println("${this.name} // $no")
            outPrint()
        }
    }

    fun createFun(): Nested {
        return Nested()
    }
}

fun main() {
//    val nested = Outer.Nested()       // inner 명시시 에러

    val outer = Outer()
    val createFun = outer.createFun()
    createFun.nestedPrint()

}
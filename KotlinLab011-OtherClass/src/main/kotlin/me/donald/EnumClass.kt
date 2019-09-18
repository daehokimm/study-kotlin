package me.donald

/**
 * 상수 클래스
 * - 자바와 유사
 * - 구성 요소가 Enum 클래스를 상속하는 *클래스* 형태
 * -- `abstract`를 이용하여 함수, 프로퍼티 override 가능
 */
enum class Direction(val no: Int) {
    NORTH(0){
        override val data: String
            get() = "north"

        override fun myFun() {
            println(this.data)
        }
    },
    SOUTH(1) {
        override val data: String
            get() = "north"

        override fun myFun() {
            println(this.data)
        }
    },
    EAST(2) {
        override val data: String
            get() = "north"

        override fun myFun() {
            println(this.data)
        }
    },
    WEST(3) {
        override val data: String
            get() = "north"

        override fun myFun() {
            println(this.data)
        }
    };

    abstract val data: String
    abstract fun myFun()
}

fun main() {
    println("${Direction.SOUTH.no}")

    Direction.SOUTH.myFun()
}
package me.donald

/**
 * 상속
 * 클래스
 * - 상속 대상이 되는 클래스는 `open`으로 상속 가능함을 명시해야
 * - 클래스 외에 함수와 프로퍼티도 상속하기 위해서는 `open`으로 명시해야함
 * 함수
 * - 오버라이드 하는 함수는 `override` 로 함수 상속 명시
 * - 오버라이드한 함수는 다시 상속된 클래스에서 오버라이드 가능(즉, `open` 따로 명시 안해줘도 됨)
 * - 오버라이드 함수가 다시 상속 못하게 하려면 `final` 명시
 * 프로퍼티
 * - 프로퍼티 오버라이드도 함수와 유사 (`open`, `override`, `final`)
 * - 프로퍼티 오버라이드 규칙
 * -- 1. 상위 클래스의 프로퍼티와 이름 타입 모두 같아야 함.
 * -- 2. 상위 val -> 하위 var "가능" // 상위 var -> 하위 val "불가"
 * -- 3. 상위 null 허용 -> 하위 null 불허 "가능" // 상위 null 불허 -> 하위 null 허용 "불가"
 */
open class Shape {
    var x: Int = 0
        set(value) {
            field = if (value < 0) 0 else value
        }

    var y: Int = 0
        set(value) {
            field = if (value < 0) 0 else value
        }

    lateinit var name: String

    open fun print() {
        println("$name : location : $x, $y")
    }
}

class Rect : Shape() {
    var width: Int = 0
        set(value) {
            field = if (value < 0) 0 else value
        }

    var height: Int = 0
        set(value) {
            field = if (value < 0) 0 else value
        }

    override fun print() {
        println("$name : location: $x, $y && width : $width, height : $height")
    }
}

class Circle : Shape() {
    var r: Int = 0
        set(value) {
            field = if (value < 0) 0 else value
        }

    override fun print() {
        println("$name : location: $x, $y && radius : $r")
    }
}

fun main(args: Array<String>) {
    val rect = Rect()
    rect.name = "myRect"
    rect.x = 1
    rect.y = 2
    rect.height = 10
    rect.width = 20
    rect.print()

    val circle = Circle()
    circle.name = "myCircle"
    circle.x = 3
    circle.y = 6
    circle.r = 15
    circle.print()
}


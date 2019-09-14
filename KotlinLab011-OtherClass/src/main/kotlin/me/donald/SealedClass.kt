package me.donald

/**
 * sealed 클래스
 * - 클래스 상속의 Enum 형태
 */
sealed class Sharp {
    class Circle(val radius: Double) : Sharp()
    class Rect(val width: Int, val height: Int) : Sharp()
}

class Triangle(val bottom: Int, val height: Int): Sharp()

fun main() {
    val circle = Sharp.Circle(10.0)
    val triangle = Triangle(5, 10)

}
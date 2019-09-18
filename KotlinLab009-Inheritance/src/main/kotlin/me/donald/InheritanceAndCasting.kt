package me.donald

/**
 * 상속과 캐스팅
 * - 하위 클래스에서 상위 클래스 캐스팅은 자동으로 이뤄짐 (스마트 캐스팅, ex. `val obj: Super = Sub()`)
 * - `as`로 캐스팅 명시 가능
 * - 상위에서 하위 캐스팅을 하려면 하 -> 상 -> 하 순서로 해야 가능
 * - null 허용 캐스팅에는 `as?` 사용
 */
open class Character {
    fun print() {
        println("Character print")
    }
}

class Donald() : Character() {
    fun print1() {
        println("Donald print1")
    }
}

class Duck() : Character() {
    fun print2() {
        println("Duck print2")
    }
}

fun smartCast(obj: Any) {
    when (obj) {
        is Donald -> obj.print1()
        is Duck -> obj.print2()
        is Character -> obj
    }
}

fun main() {
    smartCast(Donald() as Character)
//    smartCast(Character() as Donald)        // 런타임 에러
//    smartCast(Character() as Duck)          // 런타임 에러

    val donald: Donald? = null
    val c : Character? = donald as? Character
}
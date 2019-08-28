package me.donald

/**
 * 변수 초기화 - 에러
 * - 최상위 레벨, 클래스 멤버 단계에서의 변수는 선언과 함께 초기화돼야 함
 * - 함수 내부에서의 변수는 선언과 함께 초기화를 하지 않아도 되지만, 사용할 때는 초기화되어야 함
 * - 즉, 초기화하지 않는 이상 값은 없음(= 사용 불가).
 * - Java의 객체 초기화 하지 않으면 null 값이 되는 것과 차이. Kotlin은 무조건 초기화해야 사용 가능.
 */
//val topData1: Int
//var topDate2: Int     초기화 에러

class User {
//    val objData1: String
//    var objData2: String      초기화 에러

    fun some() {
        val localData1: Int
        var localData2: String

//        println(localData1)       초기화 에러

        localData2 = "hello"
        println(localData2)
    }
}
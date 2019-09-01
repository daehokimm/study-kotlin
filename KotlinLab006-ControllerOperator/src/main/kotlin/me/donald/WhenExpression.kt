package me.donald

/**
 * when
 * - Java 처럼 정수뿐만 아니라 다양한 타입과 방식으로 조건을 나눌 수 있음
 * - if-else 구문을 대체할 수 있음
 * - if 처럼 표현식으로 사용 가능
 */
fun main(args: Array<String>) {
    val data = 10
    val list = listOf<Int>(90, 100)

    when(data) {
        10, 20 -> println("data is 10 or 20")       // 여러 조건도 동시 사용 가능
        30, 40 -> println("data is 30 or 40")
        fifty() -> println("data is 50")            // 함수 값도 사용 가능
        30 + 30 -> println("data is 60")            // 연산도 사용 가능
        in 61 .. 80 -> println("data is 61 ~ 80")   // 범위 값도 가능
        in list -> println("data is 90 or 100")     // 집합 데이터도 가능
        else -> println("data is $data")            // else 로 이외 조건 설정 가능
    }

    val data2 = 15
    when {      // 인수 전달 없이 if-else 구문과 동일하게 사용 가능
        data2 < 10 -> println("data2 < 10")
        data2 >= 10 && data2 < 20 -> println("data2 is 10 ~ 20")
        else -> println("data2 > 20")
    }

    val data3 = 20
    val result = when {             // 표현식으로 사용 가능
        data2 < 10 -> "under 10 .."
        data2 == 10 -> "10"
        else -> "over 10"
    }
    println(result)
}

fun fifty() : Int {
    return 50
}
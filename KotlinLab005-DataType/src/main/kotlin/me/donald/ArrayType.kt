package me.donald

/**
 * 배열 타입
 * - 'arrayOf()', 'XXXArrayOf()' 함수로 생성 가능
 * - 'Array' 클래스를 이용하여 생성 가능 (크기와 데이터를 파라미터로 받음)
 * - 'arrayOfNulls' 를 통해 빈 배열 생성 가능
 * - 원소타입을 지정하지 않으면 모든 타입 가능
 * - 다양한 함수 지원 ('get()' 등)
 */
fun main(args: Array<String>) {
    var array = arrayOf(1, "donald", true)
    array[0] = 10
    array[2] = "world"

    println("${array[0]} .. ${array[1]} .. ${array[2]}")
    println("size : ${array.size} .. ${array.get(0)} .. ${array.get(1)} .. ${array.get(2)}")

    var arrayInt = arrayOf<Int>(10, 20, 30)
    println("${arrayInt[0]} .. ${arrayInt[1]} .. ${arrayInt[2]}")

    var arrayDouble = doubleArrayOf(10.0, 20.0, 30.0)
    println("${arrayDouble[0]} .. ${arrayDouble[1]} .. ${arrayDouble[2]}")

    var array2 = Array(3, {i -> i*10})      // 크기는 3, 초기 데이터는 함수를 통해 생성
    println("${array2[0]} .. ${array2[1]} .. ${array2[2]}")

    var emptyArray = arrayOfNulls<Any>(3)
    emptyArray[0] = "Donald"
    println("${emptyArray[0]} .. ${emptyArray[1]} .. ${emptyArray[2]}")
}
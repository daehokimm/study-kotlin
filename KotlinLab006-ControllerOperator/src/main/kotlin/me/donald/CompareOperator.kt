package me.donald

/**
 * 비교 연산자
 * - '==' 은 값 비교
 * - '===' 객체(참조) 비교
 * - 일반 클래스 경우 nullable은 비교 대상이 아님.
 * - 일반 클래스인 객체는 '?'에 의한 박싱(boxing)이 없기 때문
 * - 기초 데이터 타입(Int 등)은 '?'에 의한 박싱이 있기 때문에 nullable인 객체인 경우 값이 같아도 다른 객체
 * - 다만 -128 ~ 127 의 값은 nullable 해도 모두 동일(자바로 변경될 때 객체로 박싱되지 않고, 기초 타입으로 변경됨)
 */
fun main(args: Array<String>) {
    class User

    val user1 = User()
    val user2 = User()
    val user3 = user1

    println("user1 == user2 : ${user1 == user2}")       // false
    println("user1 === user2 : ${user1 === user2}")     // false
    println("user1 == user3 : ${user1 == user3}")       // true
    println("user1 === user3 : ${user1 === user3}")     // true

    val user4 = User()
    val user5 : User? = user4  // nullable 추가
    println("user4 == user5 : ${user4 == user5}")       // true
    println("user4 === user5 : ${user4 === user5}")     // true

    val data1 = 10
    val data2 = 10
    val data3 : Int? = 10
    val data4 : Int? = 10
    val data5 : Int? = 128
    val data6 : Int? = 128
    println("data1 == data2 : ${data1 == data2}")       // true
    println("data1 === data2 : ${data1 === data2}")     // true
    println("data1 == data3 : ${data1 == data3}")       // true
    println("data1 === data3 : ${data1 === data3}")     // true
    println("data3 == data4 : ${data3 == data4}")       // true
    println("data3 === data4 : ${data3 === data4}")     // true   : -127 < int < 128
    println("data5 == data6 : ${data5 == data6}")       // true
    println("data5 === data6 : ${data5 === data6}")     // false

}
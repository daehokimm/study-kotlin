package me.donald

fun main(args: Array<String>) {
    val a: String? = null
    a ?: println("a is null!!")

    val b: String? = "bbb"
    b ?.length

    val c: String? = null
    c !!.length     // exception
}
package me.donald

fun hoFun5(str: String): (x1: Int, x2: Int) -> Int {
    when (str) {
        "-" -> return { x1, x2 -> x1 - x2 }
        "*" -> return { x1, x2 -> x1 * x2 }
        "/" -> return { x1, x2 -> x1 / x2 }
        else -> return { x1, x2 -> x1 + x2 }
    }
}

fun main() {
    val function = hoFun5("*")
    println("result * : ${function(10, 5)}")

    val kFunction3 = ::hoFun3
}
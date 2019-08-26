package me.donald

import org.apache.commons.lang3.StringUtils

fun main(args: Array<String>) {
    val data=" Hello World !! donald "
    println(StringUtils.deleteWhitespace(data))
}


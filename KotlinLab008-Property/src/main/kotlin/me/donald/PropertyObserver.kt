package me.donald

import kotlin.properties.Delegates

class User4 {
    var name: String by Delegates.observable("nonValue", { props, old, new ->
        println("old : $old ... new : $new")
    })
}

fun main() {
    val user4 = User4()
    println("${user4.name}")
    user4.name = "donald"
    user4.name = "kim"
    println("${user4.name}")
}
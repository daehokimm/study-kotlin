package me.donald

/**
 * break, continue, label
 * - break, continue 는 자바와 동일
 * - 다만, xxx@ 로 라벨을 표시하고, break@xxx 와 같이 표기하면 라벨로 지정한 반복문을 벗어남
 */
fun main(args: Array<String>) {
    aaaa@ for (i in 1 .. 20) {
        for (j in 10 .. 200) {
            if (j > 20) break@aaaa      // aaaa@로 break
            println("i : $i , j : $j")
        }
    }
}
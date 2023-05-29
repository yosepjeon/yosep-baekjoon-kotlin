package p1436영화감독숌

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`);
    val N = scanner.nextInt()
    val endNum = "666"
    var i = 0
    var count = 0

    while (true) {
        val strValue = i.toString()

        if(strValue.contains(endNum)) count++

        if(count === N) break
        i++
    }

    print(i)
}
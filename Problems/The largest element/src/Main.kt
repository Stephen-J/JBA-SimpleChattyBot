import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var num = scanner.nextInt()
    var max = num
    while (num != 0) {
        num = scanner.nextInt()
        if (num > max) max = num
    }
    println(max)
}
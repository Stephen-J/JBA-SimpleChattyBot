import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()
    var max = 0
    repeat(num) {
        val n = scanner.nextInt()
        if (n > max && n % 4 == 0) max = n
    }
    println(max)
}

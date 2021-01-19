import java.util.Scanner
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var sum = 0
    repeat(n) {
        val v = scanner.nextInt()
        sum += v
    }
    println(sum)
}
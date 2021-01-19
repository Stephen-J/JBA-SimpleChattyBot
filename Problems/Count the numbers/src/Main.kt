import java.util.Scanner
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val range = scanner.nextInt()..scanner.nextInt()
    val n = scanner.nextInt()
    var num = 0
    for (i in range) {
        if (i % n == 0) num++
    }
    println(num)
}

import java.util.Scanner
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()
    val range = scanner.nextInt()..scanner.nextInt()
    println(num in range)
}
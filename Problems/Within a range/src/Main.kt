import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    val firstRange = scanner.nextInt() .. scanner.nextInt()
    val secondRange = scanner.nextInt() .. scanner.nextInt()
    val num = scanner.nextInt()
    println(num in firstRange || num in secondRange)
}
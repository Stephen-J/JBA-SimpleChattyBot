import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    val range1 = scanner.nextInt()..scanner.nextInt()
    val range2 = scanner.nextInt()..scanner.nextInt()
    val num = scanner.nextInt()
    println(num in range1 && num in range2)
}
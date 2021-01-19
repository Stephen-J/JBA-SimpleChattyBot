import java.util.Scanner
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val x1 = scanner.nextInt()
    val y1 = scanner.nextInt()
    val x2 = scanner.nextInt()
    val y2 = scanner.nextInt()
    val diff = listOf(Math.abs(x1 - x2),Math.abs(y1 - y2)).sorted()
    println(if (diff[0] == 1 && diff[1] == 2) "YES" else "NO")
}
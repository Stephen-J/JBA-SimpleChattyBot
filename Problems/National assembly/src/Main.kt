import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val size = Math.cbrt(scanner.nextInt().toDouble())
    println(size.toInt())
}
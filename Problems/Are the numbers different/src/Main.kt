import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val numA = scanner.nextInt()
    val numB = scanner.nextInt()
    val numC = scanner.nextInt()
    println(numA != numB && numB != numC && numA != numC)
}
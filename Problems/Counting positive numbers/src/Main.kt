import java.util.Scanner
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var numPositive = 0
    repeat(n){
        if (scanner.nextInt() > 0) numPositive++
    }
    println(numPositive)
}
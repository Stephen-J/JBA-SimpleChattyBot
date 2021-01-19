import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var tmp = scanner.nextInt()
    var isOrdered = true
    for(i in 2..n) {
        val v = scanner.nextInt()
        if(v <= tmp) isOrdered = false
        tmp = v
    }
    println(if (isOrdered) "YES" else "NO")
}
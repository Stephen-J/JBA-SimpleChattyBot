import java.util.Scanner
fun main() {
    val scanner =  Scanner(System.`in`)
    val numParts = scanner.nextInt()
    var larger = 0
    var smaller = 0
    var perfect = 0
    repeat(numParts) {
        val size = scanner.nextInt()
        if (size == 1) larger++ else if (size == -1) smaller++ else perfect++
    }
    println("$perfect $larger $smaller")
}
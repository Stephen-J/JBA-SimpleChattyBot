import java.util.Scanner
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    for (i in a..b) {
        val by3 = i % 3 == 0
        val by5 = i % 5 == 0
        println(if (by3 && by5) {
            "FizzBuzz"
        }
        else if (by3) {
            "Fizz"
        }
        else if (by5) {
            "Buzz"
        }else i)
    }
}
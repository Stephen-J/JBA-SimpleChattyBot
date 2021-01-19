import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val numReeses = scanner.nextInt()
    val isWeekend = scanner.nextBoolean()
    var success = numReeses in 10..20 && !isWeekend
    if(!success) success = numReeses in 15..25 && isWeekend
    println(success)
}
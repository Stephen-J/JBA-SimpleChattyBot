import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val duration = scanner.nextInt()
    val foodCost = scanner.nextInt()
    val flightCost = scanner.nextInt()
    val hotelCost = scanner.nextInt()
    val totalCost = flightCost * 2 + foodCost * duration + hotelCost * (duration - 1)
    println(totalCost)
}
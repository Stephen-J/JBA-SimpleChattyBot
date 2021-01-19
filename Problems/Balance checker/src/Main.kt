import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val balance = scanner.nextInt()
    var currBalance = balance
    var purchase = 0
    var error = false
    while (scanner.hasNextInt()) {
        purchase = scanner.nextInt()
        currBalance -= purchase
        if (currBalance < 0) {
            error = true
            println("Error, insufficient funds for the purchase. You have ${currBalance + purchase}, but you need $purchase.")
            break
        }
    }
    if (!error) {
        println("Thank you for choosing us to manage your account! You have $currBalance money.")
    }
    scanner.close()
}
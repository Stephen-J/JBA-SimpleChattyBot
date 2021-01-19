import java.util.Scanner
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val inputString = scanner.nextLine()
    val index = scanner.nextInt()
    println("Symbol # $index of the string \"$inputString\" is '${inputString[index - 1]}'")
}
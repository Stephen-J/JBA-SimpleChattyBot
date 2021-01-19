import java.util.Scanner
fun main(args: Array<String>) {
    val (first,last,age) = readLine()!!.split(" ")
    //val scanner =  Scanner(System.`in`)
    //val firstName = scanner.next("\b")
    //val lastName = scanner.next("\b")
    //val age = scanner.nextInt()
    println("${first[0]}. ${last.trim()}, ${age.trim()} years old")
}
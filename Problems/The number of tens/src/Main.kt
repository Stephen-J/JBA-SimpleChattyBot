import java.util.Scanner
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt().toString()
    if(num.length >= 2) {
        println(num.get(num.length - 2))
    }else{
        println("0")
    }
}
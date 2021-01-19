import java.util.Scanner
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val numScores = scanner.nextInt()
    var a = 0
    var b = 0
    var c = 0
    var d = 0
    repeat(numScores) {
        val score = scanner.nextInt()
        if(score == 2) {
            d++
        }
        else if(score == 3) {
            c++
        }
        else if(score == 4) {
            b++
        }
        else if(score == 5) {
            a++
        }
    }
    println("$d $c $b $a")
}
import java.util.Scanner
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    if (scanner.hasNextInt()){
        var num = scanner.nextInt()
        var index = 1
        var currIndex = 1
        var tmp = 0
        while (scanner.hasNextInt()) {
            tmp = scanner.nextInt()
            currIndex++
            if (tmp > num) {
                num = tmp
                index = currIndex
            }

        }
        println("$num $index")
    }
    scanner.close()
}
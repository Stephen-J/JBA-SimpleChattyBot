fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var tmp = 1
    var square = 1
    while (square <= n) {
        println("$square")
        tmp++
        square = tmp * tmp
    }
}
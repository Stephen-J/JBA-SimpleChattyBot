fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var currNum = 0
    var count = 0
    val result = mutableListOf<Int>()
    while (count < n) {
        currNum++
        var tmp = 0
        while (tmp < currNum && count < n) {
            result += currNum
            tmp++
            count++
        }
    }
    println(result.joinToString(separator = " "))
}
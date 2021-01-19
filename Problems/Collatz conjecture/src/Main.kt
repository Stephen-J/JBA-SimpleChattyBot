fun main() {
    var n = readLine()!!.toInt()
    val result = mutableListOf<Int>(n)
    while (n != 1) {
        if (n % 2 == 0) {
            n /= 2
        } else {
            n = n * 3 + 1
        }
        result += n
    }
    println(result.joinToString(separator = " "))
}
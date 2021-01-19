fun main(args: Array<String>) {
    val num = readLine()!!.toInt()
    println(if (num < 0) "negative" else if (num > 0) "positive" else "zero")
}
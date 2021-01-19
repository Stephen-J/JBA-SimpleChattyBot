fun main(args: Array<String>) {
    val chars = readLine()
    val char1 = chars!![0].toInt()
    val char2 = chars[2].toInt()
    val char3 = chars[4].toInt()
    println(char2 == char1 + 1 && char3 == char1 + 2)
}
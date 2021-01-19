fun main() {
    val chars = readLine()
    val char1 = chars!![0]
    val char2 = chars[2]
    val char3 = chars[4]
    val char4 = chars[6]
    println("${char1.isDigit()}\\${char2.isDigit()}\\${char3.isDigit()}\\${char4.isDigit()}")
}
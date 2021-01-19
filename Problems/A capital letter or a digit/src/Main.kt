fun main() {
    val ch = readLine()!![0]
    println(ch.isUpperCase() || ch in '1'..'9')
}
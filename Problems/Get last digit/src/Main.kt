fun getLastDigit(a : Int) : Char {
    return a.toString().last()
}

/* Do not change code below */
fun main(args: Array<String>) {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}
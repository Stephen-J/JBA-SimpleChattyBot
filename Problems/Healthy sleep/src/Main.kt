fun main(args: Array<String>) {    
    val min = readLine()!!.toInt()
    val max = readLine()!!.toInt()
    val numHours = readLine()!!.toInt()
    println(if (numHours < min) "Deficiency" else if (numHours > max) "Excess" else "Normal")
}
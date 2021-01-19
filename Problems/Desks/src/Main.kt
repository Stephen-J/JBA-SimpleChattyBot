fun main() {
    val groupA = readLine()!!.toInt()
    val groupB = readLine()!!.toInt()
    val groupC = readLine()!!.toInt()
    val groups = listOf<Int>(groupA,groupB,groupC)
    var desks = 0
    for(group in groups){
        var numDesks = group / 2
        if(group % 2 == 1) numDesks++
        desks += numDesks
    }
    println(desks)
}
fun main() {
    val startTime = Array(3){
        readLine()!!.toInt()
    }
    val endTime = Array(3){
        readLine()!!.toInt()
    }
    val diffTime = Array(3){
        endTime[it] - startTime[it]
    }
    val seconds = diffTime[0] * 60 * 60 + diffTime[1] * 60 + diffTime[2]
    println(seconds)
}
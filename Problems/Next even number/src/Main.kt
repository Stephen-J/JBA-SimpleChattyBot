fun main(args: Array<String>) {
    val input = readLine()!!.toInt()
    if(input % 2 == 0){
        println(input + 2)
    }else{
        println(input + 1)
    }
}
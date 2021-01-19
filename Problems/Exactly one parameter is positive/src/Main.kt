import java.util.Scanner
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num1 = scanner.nextInt()
    val num2 = scanner.nextInt()
    val num3 = scanner.nextInt()
    val nums = listOf(num1,num2,num3).sorted()
    val index = nums.indexOfFirst {
        it > 0
    }
    if(index == 2){
        println(true)
    }else{
        println(false)
    }
}
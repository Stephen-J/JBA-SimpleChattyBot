import java.util.Scanner
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val box1 = Array(3){
        scanner.nextInt()
    }
    val box2 = Array(3){
        scanner.nextInt()
    }

    box1.sort()
    box2.sort()

    if(box1[0] == box2[0] && box1[1] == box2[1] && box1[2] == box2[2]){
        println("Box 1 = Box 2")
    }else if(box1[0] <= box2[0] && box1[1] <= box2[1] && box1[2] <= box2[2]){
        println("Box 1 < Box 2")
    }else if(box1[0] >= box2[0] && box1[1] >= box2[1] && box1[2] >= box2[2]){
        println("Box 1 > Box 2")
    }
    else{
        println("Incomparable")
    }
}
import java.util.Scanner
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()
    var tmp = scanner.nextInt()
    var seqLength = 1
    var tmpSeqLength = 1
    repeat(num - 1) {
        val v = scanner.nextInt()
        if(v >= tmp) {
            tmpSeqLength++
        } else {
            if(tmpSeqLength > seqLength) seqLength = tmpSeqLength
            tmpSeqLength = 1
        }
        tmp = v
    }
    if(tmpSeqLength > seqLength) seqLength = tmpSeqLength
    println(seqLength)
}
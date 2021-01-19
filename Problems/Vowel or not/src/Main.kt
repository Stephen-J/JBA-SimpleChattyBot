fun isVowel(letter : Char) = listOf('a','e','i','o','u').contains(letter.toLowerCase())


fun main(args: Array<String>) {

    val letter = readLine()!!.get(0)

    println(isVowel(letter))
}
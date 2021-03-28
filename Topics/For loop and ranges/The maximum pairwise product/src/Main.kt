import java.util.*

fun main(args: Array<String>) { // second my solution based of "mquinta"
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    var maxNum = 1
    var secondMaxNum = 1

    for (i in 1..n) {
        val currentNum = scanner.nextInt()
        if (currentNum > maxNum) {
            secondMaxNum = maxNum // fix "mquinta" bug! input [3 4] = 12
            maxNum = currentNum
        } else if (currentNum > secondMaxNum) {
            secondMaxNum = currentNum
        }
    }
    val result = maxNum * secondMaxNum
    println(result)
}

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val (a, b, c) = Array(3) { scanner.nextDouble() }
    println((c - b) / a)
}

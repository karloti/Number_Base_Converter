import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var primary = scanner.nextInt()
    var result = 0

    repeat(n - 1) {
        val secondary = scanner.nextInt()
        if (primary < secondary) result++
        primary = secondary
    }
    println(if (result == n - 1) "YES" else "NO")
}
import kotlin.math.pow

fun finalAmount(amount: Int = 1_000, percent: Int = 5, years: Int = 10) =
    amount * (1 + percent.toDouble() / 100).pow(years)

fun main() {
    val paramName by lazy { readLine()!! }
    val paramValue by lazy { readLine()!!.toInt() }

    when (paramName) {
        "amount" -> finalAmount(amount = paramValue)
        "percent" -> finalAmount(percent = paramValue)
        "years" -> finalAmount(years = paramValue)
        else -> finalAmount()
    }.let { println(it.toInt()) }
}
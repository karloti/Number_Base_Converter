fun price(old: Int = 5, passed: Int = 100_000, speed: Int = 120, auto: Int = 0) =
    20_000 - old * 2_000 + (speed - 120) * 100 - passed / 10_000 * 200 + 1_500 * auto

fun main() {
    val paramName by lazy { readLine()!! }
    val paramValue by lazy { readLine()!!.toInt() }

    when (paramName) {
        "old" -> price(old = paramValue)
        "passed" -> price(passed = paramValue)
        "speed" -> price(speed = paramValue)
        "auto" -> price(auto = paramValue)
        else -> price()
    }.let(::println)
}

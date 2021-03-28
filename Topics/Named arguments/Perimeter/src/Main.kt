import kotlin.math.hypot

fun perimeter(vararg d: Double) = d
    .toList()
    .chunked(2)
    .map { it.first() to it.last() }
    .let { it + it.first() }
    .zipWithNext { acc, pair -> acc.first - pair.first to acc.second - pair.second }
    .sumByDouble { hypot(it.first, it.second) }
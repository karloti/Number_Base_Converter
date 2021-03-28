fun main() = List(readLine()!!.toInt()) { readLine()!!.toInt() }
    .zipWithNext()
    .runningFold(1) { acc, pair -> if (pair.first <= pair.second) acc + 1 else 1 }
    .maxOrNull()
    .let(::println)

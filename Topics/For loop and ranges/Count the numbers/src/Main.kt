fun main() = println(readLine()!!
        .split(" ")
        .map(String::toInt)
        .let { it[1] / it[2] - (it[0] - 1) / it[2] })
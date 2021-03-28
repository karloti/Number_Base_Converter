fun main() {
    val array = IntArray(100) { it * 2 + 1 }
    println(array.joinToString())
    println("SUM =" + array.sum())
}
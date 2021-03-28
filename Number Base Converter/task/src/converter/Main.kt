package converter

import java.lang.Character.forDigit
import java.math.BigDecimal
import java.math.RoundingMode

fun BigDecimal.toBase(radix: Int): String {
    var result = setScale(0, RoundingMode.DOWN).toBigInteger().toString(radix)
    var fraction = remainder(BigDecimal.ONE)
    val radixBD = radix.toBigDecimal()
    var fractionCount = 100
    if (fractionCount > 0) result += "."
    while (fraction > BigDecimal.ZERO && fractionCount > 0) {
        fraction *= radixBD
        result += forDigit(fraction.setScale(0, RoundingMode.DOWN).intValueExact(), radix)
        fraction = fraction.remainder(BigDecimal.ONE)
        fractionCount--
    }
    return result
}

fun String.toBigDecimal(radix: Int): BigDecimal {
    val num = replace(".", "").toBigInteger(radix).toBigDecimal().setScale(100)
    val den = radix.toBigDecimal().pow(dropWhile { it != '.' }.drop(1).length)
    return num / den
}

fun main() {
    while (true) {
        print("Enter two numbers in format: {source base} {target base} (To quit type /exit) ")
        val (radix1, radix2) =
            readLine()!!.let { if (it == "/exit") return else it.split(" ").map(String::toInt) }
        while (true) {
            print("Enter number in base $radix1 to convert to base $radix2 (To go back type /back) ")
            val number = readLine()!!
            if (number == "/back") break
            println("Conversion result: ${number.toBigDecimal(radix1).toBase(radix2)}")
        }
    }
}
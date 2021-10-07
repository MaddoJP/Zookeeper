import java.util.*

fun main() {
    var highestNumber = 0
    do {
        val next = readLine()!!.toInt()
        if (next > highestNumber) {
            highestNumber = next
        }
    } while (next != 0)
    println(highestNumber)
}
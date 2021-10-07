const val divisor = 4
fun main() {
    val counter = readLine()!!.toInt()
    var highestDivisor = 0

    repeat(counter) {
        val next = readLine()!!.toInt()
        if (next % divisor == 0 && next > highestDivisor) {
            highestDivisor = next
        }
    }
    print(highestDivisor)
}
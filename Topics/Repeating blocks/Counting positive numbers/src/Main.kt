const val ZERO = 0
fun main() {
    val counter = readLine()!!.toInt()
    var positiveNumbers = 0

    repeat(counter) {
        val next = readLine()!!.toInt()
        if (next > ZERO) {
            positiveNumbers++
        }
    }
    print(positiveNumbers)
}
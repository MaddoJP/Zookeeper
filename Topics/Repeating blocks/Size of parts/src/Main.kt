fun main() {
    val counter = readLine()!!.toInt()
    var perfect = 0
    var larger = 0
    var smaller = 0

    repeat(counter) {
        val next = readLine()!!.toInt()
        if (next == 0) {
            perfect++
        }
        if (next > 0) {
            larger++
        }
        if (next < 0) {
            smaller++
        }

    }
    println("$perfect $larger $smaller")
}

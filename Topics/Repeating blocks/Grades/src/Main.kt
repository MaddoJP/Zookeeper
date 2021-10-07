fun main() {
    val counter = readLine()!!.toInt()
    var aCounter = 0
    var bCounter = 0
    var cCounter = 0
    var dCounter = 0

    repeat(counter) {
        val next = readLine()!!.toInt()
        if (next == 2) {
            dCounter++
        }
        if (next == 3) {
            cCounter++
        }
        if (next == 4) {
            bCounter++
        }
        if (next == 5) {
            aCounter++
        }

    }
    println("$dCounter $cCounter $bCounter $aCounter")
}

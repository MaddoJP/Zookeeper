fun main() {
    val a: Int = readLine()!!.toInt()
    val b: Char = readLine()!!.first()
    if (a.toChar() == b) {
        println("true")
    } else {
        println("false")
    }
}
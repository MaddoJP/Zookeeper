fun main() {
    val a: Char = readLine()!!.first()
    val b: Char = readLine()!!.first()
    if (a.lowercase() == b.lowercase()) {
        print("true")
    } else {
        print("false")
    }
}
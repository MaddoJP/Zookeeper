fun main() {
    val a: Char = readLine()!!.first()
    val b: Char = readLine()!!.first()
    val c: Char = readLine()!!.first()

    if (a + 1 == b && b + 1 == c) {
        print("true")
    } else {
        print("false")
    }
}
fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    if (a > 0 && (b <= 0 && c <= 0) || b > 0 && (a <= 0 && c <= 0) || c > 0 && (a <= 0 && b <= 0)) {
        print("true")
    } else {
        print("false")
    }

}
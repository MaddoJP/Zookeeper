fun main() {
    val a: Char = readLine()!!.first()
    if (a.isUpperCase()) {
        print("true")
    } else if (a.isDigit() && a.digitToInt() in 1..9) {
        print("true")
    } else {
        print("false")
    }
}
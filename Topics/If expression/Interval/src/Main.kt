fun main() {
    val input = readLine()!!.toInt()
    if (input > -15 && input <= 12) {
        print("True")
    } else if (input > 14 && input < 17) {
        print("True")
    } else if (input >= 19) {
        print("True")
    } else {
        print("False")
    }
}
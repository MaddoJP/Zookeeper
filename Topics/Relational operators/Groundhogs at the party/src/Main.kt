fun main() {
    val numberReesesPeanutButterCups = readLine()!!.toInt()
    val isWeekend = readLine().toBoolean()

    if (isWeekend) {
        if (numberReesesPeanutButterCups in 15..25) {
            print("true")
        } else {
            print("false")
        }
    }

    if (!isWeekend) {
        if (numberReesesPeanutButterCups in 10..20) {
            print("true")
        } else {
            print("false")
        }
    }
}
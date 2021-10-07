fun main() {
    val hourToSecond = 60*60
    val minuteToSecond = 60

    val startHours = readLine()!!.toInt() * hourToSecond
    val startMinutes = readLine()!!.toInt() * minuteToSecond
    val startSeconds = readLine()!!.toInt()

    val endHours = readLine()!!.toInt() * hourToSecond
    val endMinutes = readLine()!!.toInt() * minuteToSecond
    val endSeconds = readLine()!!.toInt()

    val endTime = endSeconds + endMinutes + endHours
    val startTime = startSeconds + startMinutes + startHours

    print(endTime - startTime)
}
class Calendar(var day: String, var month: String, var year: String) {    
    fun selectCurrentDay() {
        day = "d123d"
        month = "m45m"
        year = "y6y"
        print(day)
        print(" ")
        print(month)
        print(" ")
        print(year)
    }
}
fun createCalendar() =
    Calendar("-", "-", "-")

fun main() {
    val calendar = createCalendar()
    calendar.selectCurrentDay()
}
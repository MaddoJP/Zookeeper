fun main() {
    val input = readLine()!!.toInt()
    var i = 1
    while (i * i <= input) {
        println(i * i)
        i++
    }
}
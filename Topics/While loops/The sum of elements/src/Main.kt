fun main() {
    var sum = 0
    do {
        val next = readLine()!!.toInt()
        sum += next
    } while (next != 0)
    println(sum)
}
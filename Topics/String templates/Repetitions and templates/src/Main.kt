fun main() {
    val a = readLine()!!.toString()
    println("${a.length} repetitions of the word $a: ${a.repeat(a.length)}")
}
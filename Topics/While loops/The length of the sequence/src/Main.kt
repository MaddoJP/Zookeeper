import java.util.*

fun main() {
    var counter = 0
    val scanner = Scanner(System.`in`)
    while (scanner.hasNext() && scanner.nextInt() != 0) {
        counter++
    }
    println(counter)
}

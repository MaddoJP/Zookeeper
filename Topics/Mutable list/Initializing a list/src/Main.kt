fun main() {
    val numbers = MutableList(100) { 0 }
    numbers[0] = 1
    numbers[10 - 1] = 10
    numbers[100 - 1] = 100


    // do not touch the lines below 
    println(numbers.joinToString())
}
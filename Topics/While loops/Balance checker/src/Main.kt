import java.util.*

fun main() {
    var availableBalance = readLine()!!.toInt()
    val scanner = Scanner(System.`in`)
    while (scanner.hasNextInt()) {
        if (scanner.hasNextInt()) {
            var purchaseItem = scanner.nextInt()
            if (availableBalance - purchaseItem >= 0) {
                availableBalance -= purchaseItem
            } else {
                println("Error, insufficient funds for the purchase. Your balance is $availableBalance, but you need $purchaseItem.")
            }
        }
    }
    println("Thank you for choosing us to manage your account! Your balance is $availableBalance.")

}
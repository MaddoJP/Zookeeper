fun main() {
    var input = readLine()!!.toInt()
    print(input)
    while (input != 1) {
        if (input % 2 != 0) {
            input = input * 3 + 1
            print(" $input")
        }
        if (input % 2 == 0) {
            input /= 2
            print(" $input")
        }
    }
}
fun main() {
    val a = readLine()!!.toString()
    if (a.length == 1) {
        print("0")
    } else {
        print(a[a.length - 2])
    }
}
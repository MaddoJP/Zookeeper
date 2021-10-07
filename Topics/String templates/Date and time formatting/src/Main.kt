fun main() {
    val time = readLine()
    val timeVals = time?.split(" ")
    val date = readLine()
    val dateVals = date?.split(" ")

    println(
        "${timeVals?.get(0)}:${timeVals?.get(1)}:${timeVals?.get(2)} ${dateVals?.get(0)}/${dateVals?.get(1)}/${
            dateVals?.get(
                2
            )
        }"
    )
}
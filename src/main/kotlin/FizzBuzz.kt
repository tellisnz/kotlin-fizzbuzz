class FizzBuzz(val fizzNumber: Int, val buzzNumber: Int) {

    fun runFizzBuzz(range: Int): Array<Any?> {
        val returnArray = arrayOfNulls<Any?>(range)
        (1..range).forEach {
            when {
                it % fizzNumber == 0 && it % buzzNumber == 0 -> returnArray[it - 1] = "FizzBuzz"
                it % fizzNumber == 0 -> returnArray[it - 1] = "Fizz"
                it % buzzNumber == 0 -> returnArray[it - 1] = "Buzz"
                else -> returnArray[it - 1] = it
            }
        }
        return returnArray
    }
}

fun main(args: Array<String>) {
    val fizzBuzzes = FizzBuzz(3, 5).runFizzBuzz(100)
    for (i in fizzBuzzes.indices) {
        println("${i + 1}: ${fizzBuzzes[i]}")
    }
}
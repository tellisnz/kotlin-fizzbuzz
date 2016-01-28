import org.jetbrains.spek.api.Spek
import com.natpryce.hamkrest.*
import com.natpryce.hamkrest.assertion.assertThat

class FizbuzzSpecs: Spek() {
    init{

    given("a fizz buzzer configured with 3 as fizz and 5 as buzz") {
        val fizzBuzzer = FizzBuzz(3, 5)
        on("being called with 30") {
            val returnedArray = fizzBuzzer.runFizzBuzz(30)
            it ("should output the correct fizz buzz response") {
                val expectedArray = arrayOf<Any?>(1, 2, "Fizz", 4, "Buzz",
                        "Fizz", 7, 8, "Fizz", "Buzz", 11, "Fizz", 13, 14, "FizzBuzz",
                        16, 17, "Fizz", 19, "Buzz", "Fizz", 22, 23, "Fizz", "Buzz",
                        26, "Fizz", 28, 29, "FizzBuzz")
                for (i in expectedArray.indices) {
                    assertThat(returnedArray[i], equalTo(expectedArray[i]))
                }
            }
        }
    }

    given("a fizz buzzer configured with 4 as fizz and 6 as buzz") {
        val fizzBuzzer = FizzBuzz(4, 6)
        on("being called with 24") {
            val returnedArray = fizzBuzzer.runFizzBuzz(24)
            it ("should output the correct fizz buzz response") {
                val expectedArray = arrayOf<Any?>(1, 2, 3, "Fizz", 5,
                        "Buzz", 7, "Fizz", 9, 10, 11, "FizzBuzz", 13, 14, 15,
                        "Fizz", 17, "Buzz", 19, "Fizz", 21, 22, 23, "FizzBuzz")
                for (i in expectedArray.indices) {
                    assertThat(returnedArray[i], equalTo(expectedArray[i]))
                }
            }
        }
    }
}}
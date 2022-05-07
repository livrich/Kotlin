import java.util.Scanner

var count = 0
var another = 0

fun more() {
    count += 1
    another += 1
    println("$count $another")
}

fun main() {
    val stdInput = Scanner(System.`in`)

    print("Enter text: ")
	val test = stdInput.nextLine()
    // println("You entered: $test")

    if (test.equals("p")) {
        more()
    }
}
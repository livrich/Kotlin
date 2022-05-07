import java.util.Scanner

fun anotherOne () {

    var a = 1
    var b = "bat"

    if (a == 1) {
        println("Yep, a is 1")
    } else {
        println("a is not 1")
    }

    if (b == "cat") {
        print("It is a cat")
    } else {
        println("It is a bat")
    }

}


fun main() {
	
    // Setup the input from user
	val stdInput = Scanner(System.`in`)

    print("Enter text: ")
    // Get the next line from the user. (pauses prompt)
	val test = stdInput.nextLine()
    println("You entered: $test")
	
	print("Enter new: ")
    // Get the next line from the user. (pauses prompt)
	val test2 = stdInput.nextLine()
	print("New: $test2")

    // anotherOne()



}


// kotlinc filename.kt -d outfilename.jar

// java -jar outfilename.jar
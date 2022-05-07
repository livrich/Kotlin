import java.util.Scanner
import kotlin.system.exitProcess

// intro message, quiz questions/options, tie breaker question/options
val intro = ("This is a quiz to tell you what kind of bender\n" +
            "you would be in the avatar world. There are 15\n" +
            "questions. Please enter the letter corresponding to\n" +
            "the answer you want to pick for each question.")

val q1 = ("1. Do you like to plan ahead or be spontaneous?\n" +
            "\tA. Plan ahead\n" +
            "\tB. Be spontaneous\n" +
            "\nAnswer: ")

val q2 = ("2. Which would you have as a pet?\n" +
            "\tA. An Eagle hawk\n" +
            "\tB. A Turtle duck\n" +
            "\tC. An otter penguin\n" +
            "\tD. An Eel hound\n" +
            "\nAnswer: ")

val q3 = ("3. What is more important in battle?\n" +
            "\tA. Offense\n" +
            "\tB. Defense\n" +
            "\nAnswer: ")

val q4 = ("4. Are you more of a morning or nocturnal person?\n" +
            "\tA. Morning\n" +
            "\tB. Nocturnal\n" +
            "\nAnswer: ")

val q5 = ("5. How do you deal with stress?\n" +
            "\tA. Meditation\n" +
            "\tB. Work it out physically\n" +
            "\tC. Distract myself\n" +
            "\tD. Take it out on others\n" +
            "\nAnswer: ")

val q6 = ("6. What is your favorite season?\n" +
            "\tA. Spring\n" +
            "\tB. Summer\n" +
            "\tC. Fall\n" +
            "\tD. Winter\n" +
            "\nAnswer: ")

val q7 = ("7. Are you a glass half empry or half full kind of person?\n" +
            "\tA. Half full\n" +
            "\tB. Half empty\n" +
            "\nAnswer: ")    

val q8 = ("8. Which do you trust more, instinct or experience?\n" +
            "\tA. Instinct\n" +
            "\tB. Experience\n" +
            "\nAnswer: ")

val q9 = ("9. Which vacation sounds the most fun?\n" +
            "\tA. Relaxing on a beach\n" +
            "\tB. A quiet cabin in the woods\n" +
            "\tC. Visiting a ski resort\n" +
            "\tD. A safari in the jungle\n" +
            "\nAnswer: ")

val q10 = ("10. What do you desire most in life?\n" +
            "\tA. Power\n" +
            "\tB. Freedom\n" +
            "\tC. Peace\n" +
            "\tD. Knowledge\n" +
            "\nAnswer: ")

val q11 = ("11. What is your weakness?\n" +
            "\tA. I can be impuslive\n" +
            "\tB. I hate change\n" +
            "\tC. I have a quick temper\n" +
            "\tD. I can be overly sensitive\n" +
            "\nAnswer: ")

val q12 = ("12. Would you rather live in a rigid society or live free, but alone?\n" +
            "\tA. Rigid societ\n" +
            "\tB. Free but alone\n" +
            "\nAnswer: ")

val q13 = ("13. What makes a good bender?\n" +
            "\tA. Spiritual connection\n" +
            "\tB. Raw power\n" +
            "\tC. Connection to nature\n" +
            "\tD. Disiplined technique\n" +
            "\nAnswer: ")  
            
val q14 = ("14. Which adjective fits you the best?\n" +
            "\tA. Adaptable\n" +
            "\tB. Passionate\n" +
            "\tC. Reliable\n" +
            "\tD. Empathetic\n" +
            "\nAnswer: ")

val q15 = ("15. Which of these physical skills is your strength?\n" +
            "\tA. Agility\n" +
            "\tB. Endurance\n" +
            "\tC. Strength\n" +
            "\tD. Speed\n" +
            "\nAnswer: ")

val qTie1 = ("Tie Breaker. What is your outfit of choice?")
val qTie2 = ("\tAnimal. Animal hides/fur\n")
val qTie3 = ("\tSilk. Oversized silk robes\n")
val qTie4 = ("\tFormal. Stiff formal wear\n")
val qTie5 = ("\tSimple. Simple tunic and belt\n")
val qTie6 = ("\nAnswer: ")


// store score of types of benders
var air = 0
var earth = 0
var fire = 0
var water = 0


// Determine which element has the highest score
// Return string name of element with highest score
fun highScore():String {
    var highScore = 0
    var type = ""

    if (air > highScore) {
        highScore = air
        type = "air"
    }
    if (earth > highScore) {
        highScore = earth
        type = "earth"
    } 
    if (fire > highScore) {
        highScore = fire
        type = "fire"
    } 
    if (water > highScore) {
        highScore = water
        type = "water"
    }
    return type
}


// Determine if any of the scores are tied
// Return boolean value tie that will prompt tie breaker question
fun isTie(): Boolean {
    var tie = false

    if (water == air || water == earth || water == fire) {
        tie = true
    } else if (air == earth || air == fire) {
        tie = true
    } else if (earth == fire) {
        tie = true
    }
    return tie
}


// Tell user how to answer this question because it is different.
// Display tie breaker question and only the options to break the tie.
// Increase appropriate score based on answer picked.
fun askQTie() {
    println("This question is different. Please type the full word\n" +
            "that is shown instead of 'A, B, C, D.' Thank you.\n")

    val stdInput = Scanner(System.`in`)

    // Determine what answer options need to be displayed
    /*Not using 'A, B, C, D' answer options becasue it would
    what options are displayed changes. Thus 'C' might not
    always be option C.*/
    println(qTie1)
    if (water == air) {
        println("$qTie2 $qTie3")
    } else if (water == earth) {
        println("$qTie2 $qTie5")
    } else if (water == fire) {
        println("$qTie2 $qTie4")
    } else if (air == earth) {
        println("$qTie3 $qTie5")
    } else if (air == fire) {
        println("$qTie3 $qTie4")
    } else if (earth == fire) {
        println("$qTie5 $qTie4")
    }
    // Display line where answer will be entered
    println(qTie6)
    var qTieAnswer = stdInput.nextLine()
    
    // Determine what score to increase
    if (qTieAnswer.equals("animal")) {
        water += 1
    } else if (qTieAnswer.equals("silk")) {
        air += 1
    } else if (qTieAnswer.equals("formal")) {
        fire += 1
    } else if (qTieAnswer.equals("simple")) {
        earth += 1
    }
}


/*askQ1 - askQ15 all do the same general thing.
They display the correct question and answer choices.
Determines what score to increase based on answer.
('A' does not always correlate to 'water' so needs to
be calculated with each question.)
Calls next question function (except for last question). 

Refer to askQ1 for more specific comments.*/
fun askQ15() {
    val stdInput = Scanner(System.`in`)

    print("\n $q15")
    var q15Answer = stdInput.nextLine()
    
    if (q15Answer.equals("a")) {
        water += 1
    } else if (q15Answer.equals("b")) {
        earth += 1
    } else if (q15Answer.equals("c")) {
        fire += 1
    } else {
        air += 1
    }
}

fun askQ14() {
    val stdInput = Scanner(System.`in`)

    print("\n $q14")
    var q14Answer = stdInput.nextLine()
    
    if (q14Answer.equals("a")) {
        water += 1
    } else if (q14Answer.equals("b")) {
        fire += 1
    } else if (q14Answer.equals("c")) {
        earth += 1
    } else {
        air += 1
    }
    askQ15()
}

fun askQ13() {
    val stdInput = Scanner(System.`in`)

    print("\n $q13")
    var q13Answer = stdInput.nextLine()
    
    if (q13Answer.equals("a")) {
        air += 1
    } else if (q13Answer.equals("b")) {
        fire += 1
    } else if (q13Answer.equals("c")) {
        earth += 1
    } else {
        water += 1
    }
    askQ14()
}

fun askQ12() {
    val stdInput = Scanner(System.`in`)

    print("\n $q12")
    var q12Answer = stdInput.nextLine()
    
    if (q12Answer.equals("a")) {
        water += 1
        earth += 1
    } else {
        fire += 1
        air += 1
    }
    askQ13()
}

fun askQ11() {
    val stdInput = Scanner(System.`in`)

    print("\n $q11")
    var q11Answer = stdInput.nextLine()
    
    if (q11Answer.equals("a")) {
        air += 1
    } else if (q11Answer.equals("b")) {
        earth += 1
    } else if (q11Answer.equals("c")) {
        fire += 1
    } else {
        water += 1
    }
    askQ12()
}

fun askQ10() {
    val stdInput = Scanner(System.`in`)

    print("\n $q10")
    var q10Answer = stdInput.nextLine()
    
    if (q10Answer.equals("a")) {
        fire += 1
    } else if (q10Answer.equals("b")) {
        earth += 1
    } else if (q10Answer.equals("c")) {
        air += 1
    } else {
        water += 1
    }
    askQ11()
}

fun askQ9() {
    val stdInput = Scanner(System.`in`)

    print("\n $q9")
    var q9Answer = stdInput.nextLine()
    
    if (q9Answer.equals("a")) {
        fire += 1
    } else if (q9Answer.equals("b")) {
        air += 1
    } else if (q9Answer.equals("c")) {
        water += 1
    } else {
        earth += 1
    }
    askQ10()
}

fun askQ8() {
    val stdInput = Scanner(System.`in`)

    print("\n $q8")
    var q8Answer = stdInput.nextLine()
    
    if (q8Answer.equals("a")) {
        water += 1
        fire += 1
    } else {
        earth += 1
        air += 1
    }
    askQ9()
}

fun askQ7() {
    val stdInput = Scanner(System.`in`)

    print("\n $q7")
    var q7Answer = stdInput.nextLine()
    
    if (q7Answer.equals("a")) {
        air += 1
        water += 1
    } else {
        earth += 1
        fire += 1
    }
    askQ8()
}

fun askQ6() {
    val stdInput = Scanner(System.`in`)

    print("\n $q6")
    var q6Answer = stdInput.nextLine()
    
    if (q6Answer.equals("a")) {
        air += 1
    } else if (q6Answer.equals("b")) {
        fire += 1
    } else if (q6Answer.equals("c")) {
        earth += 1
    } else {
        water += 1
    }
    askQ7()
}

fun askQ5() {
    val stdInput = Scanner(System.`in`)

    print("\n $q5")
    var q5Answer = stdInput.nextLine()
    
    if (q5Answer.equals("a")) {
        air += 1
    } else if (q5Answer.equals("b")) {
        earth += 1
    } else if (q5Answer.equals("c")) {
        water += 1
    } else {
        fire += 1
    }
    askQ6()
}

fun askQ4() {
    val stdInput = Scanner(System.`in`)

    print("\n $q4")
    var q4Answer = stdInput.nextLine()
    
    if (q4Answer.equals("a")) {
        air += 1
        fire += 1
    } else {
        earth += 1
        water += 1
    }
    askQ5()
}

fun askQ3() {
    val stdInput = Scanner(System.`in`)

    print("\n $q3")
    var q3Answer = stdInput.nextLine()
    
    if (q3Answer.equals("a")) {
        water += 1
        fire += 1
    } else {
        earth += 1
        air += 1
    }
    askQ4()
}

fun askQ2() {
    val stdInput = Scanner(System.`in`)

    print("\n $q2")
    var q2Answer = stdInput.nextLine()
    
    if (q2Answer.equals("a")) {
        air += 1
    } else if (q2Answer.equals("b")) {
        fire += 1
    } else if (q2Answer.equals("c")) {
        water += 1
    } else {
        earth += 1
    }
    askQ3()
}

fun askQ1() {
    // Needed to be able to get input from user
    val stdInput = Scanner(System.`in`)

    // Display question and answer options
    print("\n $q1")
    // Get input from user
    var q1Answer = stdInput.nextLine()
    
    // Determine what scores to increase
    if (q1Answer.equals("a")) {
        water += 1
        air += 1
    } else {
        earth += 1
        fire += 1
    }
    // Call function with next question
    askQ2()
}


// Runs/calls/displays parts of the program
fun main() {
    // Display into message about what program does
    println(intro)
    println()

    val stdInput = Scanner(System.`in`)

    // Get input from user if they want to take quiz or not
    print("Do you want to take the quiz? (y/n): ")
    var answer = stdInput.nextLine()

    // Call first question function or exit the program
    if (answer.equals("y")) {
        askQ1()
    } else {
        println("Oh... ok, bye.")
        exitProcess(0)
    }

    // Determine if any of the scores are tied
    var needBreaker = isTie()
    // Call tie breaker question function if needed
    if (needBreaker.equals(true)) {
        askQTie()
    }

    // Display thank you end message
    println("\nThank you for taking the quiz!")
    // Call function to determine what element has highest score
    var element = highScore()
    // Determine correct grammar to display result of quiz
    if (element.equals("air") || element.equals("earth")) {
        println("You would be an $element bender.")
    } else {
        println("You would be a $element bender.")
    }
    // Display final score for each element type
    println("\nYour final scores were:")
    println("Air: $air")
    println("Earth: $earth")
    println("Fire: $fire")
    println("Water: $water")
}


// How to compile and run code:
// kotlinc demo.kt
// kotlin DemoKt

// Will work but not the best way to run:
// kotlinc filename.kt -d outfilename.jar
// java -jar outfilename.jar
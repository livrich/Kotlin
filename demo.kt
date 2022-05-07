class Animal(val species: String, val color: String, val age: Int,
            animalNames: List<String>) {
    init {
        for (name in animalNames) {
            println("The names of the animals are: $animalNames")
        }
    }

    fun speak() {
        if (species.equals("Parrot")) {
            println("Squak! I want a cracker.")
        } else if (species.equals("Elephant")) {
            println("Stomp! I want a peanut.")
        } else if (species.equals("Crockodile")) {
            println("Splash! I want a steak.")
        } else if (species.equals("Penguine")) {
            println("Slap! I want a fish.")
        } else {
            println("That is not one of the animals.")
        }
    }
}


fun main() {
    var pollyParrot = Animal("Parrot", "Red", 4, listOf("Polly", "Ellie", "Cronk", "Penny"))
    pollyParrot.speak()

    var pennyPenguine = Animal("Penguine", "Black", 14, listOf("Polly", "Ellie", "Cronk", "Penny"))
    pennyPenguine.speak()
}

// How to properly run:
// kotlinc demo.kt
// kotlin DemoKt


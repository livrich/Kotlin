// open class so other classes can inherit from it
// 3 basic things that all shapes have/need
open class Shape (var rows: Int, var char1: String, var char2: String)

// inherits from Shape class with addition of count and rowLen variables
class Triangle (rows: Int, char1: String, char2: String): Shape(rows, char1, char2) {
    var count = 0
    var rowLen = rows
}

// runs main bulk of code
fun main() {
    // instance of Shape class with variable values
    val square = Shape(7, "X  ", "O  ")
    
    // determine number of rows for square
    for (rowNums in 1 .. square.rows) {
      // determine number of columns for square
      for (columnNums in 1 .. square.rows) {
        // if row and column are both even or odd
        if ((rowNums % 2 == 0 && columnNums % 2 == 0) 
        || (rowNums % 2 == 1 && columnNums % 2 == 1)) {
          print(square.char1)
        } else {
          print(square.char2)
        }
      }

      // display blank space between characters
      println()
    }
  
    // display blank line between square and triangle
    println()
    
    // instance of Triangle class with variable values
    val triangle = Triangle(10, "/  ", "   ")
    
    // determines number of rows
    for (nums in triangle.rows downTo 1) {
      // determines number of characters in a row
      while (triangle.count < triangle.rowLen) {
        triangle.count ++
        // determine if edge of triangle or not
        if (triangle.count != 1 && triangle.count != triangle.rowLen && nums != triangle.rows) {
          print(triangle.char2)
        } else {
          print(triangle.char1)
        }
      }
      // display blank space between characters
      println()
      // reset count variable so while loop will keep running
      triangle.count = 0
      // decrease rowLen with each iteration of for loop
      triangle.rowLen --
    }
  
  }


// How to compile and run code:
// kotlinc shapes.kt
// kotlin ShapesKt
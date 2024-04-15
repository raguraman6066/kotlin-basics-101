/*: * Functions
 */

fun aFunction() {
    print("I'm a function")
}

fun aFunctionReturning(): String {
    return "I'm a function"
}

fun aFunctionReturning2(): String = "I'm a function"

// Arguments
fun sum(a: Int, b: Int): Int {
    return a+b
}

// How do you call sum?

sum(1,2)
sum(a=3,b=8)


/*: * Extension functions
    You can add functions to any Type! Careful OOP extremists!
*/
fun Int.isEven() : Boolean {
    return this % 2 == 0
}



/*: * Lambda functions, Type is (arguments) -> ReturnType
   if no return is expected, we use Unit
 */
val myFunction: () -> Unit {

}


//to call
myFunction()

// implicit `it` argument when there is only one argument
// you can still name it if you want to
val greet: (String) -> String
greet = {
    return "Hello $it"
}

val myCalc: (Int, Int) -> Int = a,b -> a+b

        myCalc(1,2)

//lambda expression for functional programming

        val lambdaExp:(Int,Int)->Int = a,b->a-b

fun main() {
    val result = myCalc(1, 2)
    println("Result: $result") // Output: Result: 3
}


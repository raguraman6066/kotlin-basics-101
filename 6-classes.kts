/*: * Classes
 Full support for OOP, we won't use it a lot in JetPack composable
 Class syntax is different from what you expect!
*/
class Person {
    // property
    public var id : Int = 0
    // function - method
    fun print() {
        println("Person id: ${this.id}")
    }
}
// no new keyword!
val p = Person()

// so far, so good, but there's more.
// classes are closed by default, they can't be inherited
class User: Person() { }   // WRONG!

// you have to declare a class explicitly as open to let it being extended
// when we declare the superclass, we are actually executing its constructor! (parenthesis)
// also every method that you want to be overridden must have open
open class Record {
    open fun open() {}
}
class DBRecord: Record() {
    override fun open() {}   // you have to use override prefix
}

// let's talk about constructors
// there is a Primary constructor, secondary constructors and a initializer block
// The primary constructor is defined in the class name definition

open class Request(val url: String)   // if the class has no other props or methods, don't need a block
// primary constructor arguments become properties if var or val is used!
val r = Request("https://frontendmasters.com")
print(r.url)

// An initializer block is just a code that will be executed after init
// You can have many init blocks per class
class HttpRequest(url: String): Request(url) {
    init {
        print("Connecting to HTTP server...")
    }
}

// Secondary constructors use the constructor key
// They must call the primary constructor with the : this() suffix in signature
class User(val id: Int) {
    private var name= "Unnamed $id user"

    constructor(name: String): this(0) {
        this.name = name
    }

    constructor(id: Int, name: String): this(id) {
        this.name = name
    }
}

open class Request(var url: String) {
    // No need for init block, as url is already a property
}

fun main() {
    val r = Request("https://frontendmasters.com")
    println("Original URL: ${r.url}") // Accessing the url property outside the class

    r.url = "https://example.com" // Changing the value of the url property
    println("Updated URL: ${r.url}") // Accessing the updated url property
}


open class Request(url: String) {
    init {
        println("URL: $url") // Accessing the url parameter directly in the init block
    }
}

fun main() {
    val r = Request("https://frontendmasters.com")
}






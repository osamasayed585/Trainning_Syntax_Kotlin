package abstraction

class Dog: Animal() {
    override var age: Int = 10;

    override fun sound() {

        println("Woof")
    }
}
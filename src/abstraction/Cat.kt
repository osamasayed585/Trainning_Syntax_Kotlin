package abstraction

class Cat: Animal() {
    override var age: Int = 15

    override fun sound() {
        println("Meow")
    }


}
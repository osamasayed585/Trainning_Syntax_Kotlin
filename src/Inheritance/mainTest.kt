package Inheritance

fun main() {

    val testObj = Gallery(model = "x6",welcome = "Hello dear")

    testObj.toString()
    testObj.sayHelloCar()

    testObj.getName("One")
    testObj.getName("Two")
    testObj.getName("Three")
    println(  testObj.getNameCount)
}
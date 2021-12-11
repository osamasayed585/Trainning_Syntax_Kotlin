package Inheritance

open class Car(var model: String) {

    var getCarCount = 0
    private set

    fun getModel(){
        println("$model")
    }
}
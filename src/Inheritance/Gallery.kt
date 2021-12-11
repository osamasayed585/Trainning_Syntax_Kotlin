package Inheritance

class Gallery(var welcome: String, model: String): Car(model) {

    fun sayHelloCar(){
        println("$welcome")
    }
}
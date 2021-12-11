package Inheritance

open class Car(var model: String) {

    val listName =  mutableListOf<String>()

    var getNameCount = 0
    private set
    get() = listName.size

    fun getModel(){
        println("$model")
    }
    fun getName(name: String){
        listName.add(name)
    }
}
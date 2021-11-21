package function
// lambda

var name: String = "Kotlin"
// this is a lambda
val infoName = {
    "Hello world"
}

val SecondInfoName: (String,String) -> String = { firstName , lastName ->
    "This is $firstName $lastName"
}

val thirdInfoName: (Int, Int) -> Int = { num , num2 ->
   num + num2
}

val fourInfoName: (String) -> Unit = {
    if (it == "Osama") {
        println("Yes")
    }
}
val another: () -> Unit = {
    println("another")
}


fun main() {
    println(name)
    println(infoName())
    println(SecondInfoName("Android ", "DEV"))
    println(thirdInfoName(2, 5))
    fourInfoName("Osama")
    another()
}
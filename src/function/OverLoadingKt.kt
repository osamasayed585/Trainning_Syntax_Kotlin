package function

fun likes(num: Int): Int {
    return num
}
fun likes(num: Int, secondNum: Int): Int {
    return num + secondNum
}
fun likes(firstName: String, lastName: String) = "$firstName $lastName"




fun main() {
    println(likes("Osama","Sayed"))
    println(likes(30))
    println(likes(30, 20))
}
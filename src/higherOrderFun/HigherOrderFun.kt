package higherOrderFun


fun sum(num1: Int, num2:Int) = num1 * num2

fun getHigherOrder(myFun: (Int, Int)-> Int ): Int{
    return myFun(2,34)
}

fun main() {
    val res = getHigherOrder(::sum)
    println(res)
}
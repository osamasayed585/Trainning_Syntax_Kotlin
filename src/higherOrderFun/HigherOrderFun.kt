package higherOrderFun

fun operation(num: Int, num2: Int, pass: (Int,Int) -> Int): Int{
    return pass(num, num2)
}
fun otherOperation(pass: (Int, Int)-> Int ): Int{
    return pass(21,7)
}
fun process(num1: Int, num2:Int) = num1 + num2

val result: (Int,Int) -> Int = {firstNum, secondNum -> firstNum / secondNum}

fun main() {
    println(operation(3,3){num: Int, num2: Int -> num*num2 })
    println(operation(3,3,::process))
    println(otherOperation(result))
}
















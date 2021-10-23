fun main() {
//  this is a array
//    var arrString = arrayOf("abc", "hello", "test", "nm")
//    var arrDouble = doubleArrayOf(12.2,12.3,434.3)
//    var IntArray = arrayOf(1.1,2.3,3.4,4.5,5.6,6.7)
//    println("Array last: "+arrString.last())
//    println("first Array: "+arrString.first())
//    println("Size Array: "+arrString.size)

//  this is a arrayList

    val colors = ArrayList<String>()
    colors.add("wight")
    colors.add("red")
    colors.add("back")
    colors.add("Green")


    // this is a forLoop in kotlin
    for (n in 0 until colors.size ){
        // you must add keyword until after num 0
        println(colors[n])
    }
    // this a new way in for loop
    println("----------------")
    for (color in colors){
        println(color)
    }
}
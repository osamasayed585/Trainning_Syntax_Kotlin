package list

fun main() {   //    index    0      1        2        3      4         5     6

    val infoList = listOf("Hello", "OSama", "Sayed", "and", "Welcome", "to", "Kotiln")
    // for loop with list in kotlin

    infoList.forEach {        // name ->
        println(it)           // println(name)
    }

//  for (item in infoList){ println(item)}

//    for (item in 0 until infoList.size ){ println(infoList[item])}

//    for (item in 0..infoList.size -1) { println(infoList[item]) }

//    for (element in 0..10 step 2) { println(element) }

// for (element in 10.downTo(0) step 2){ println(element) }

//  for (element in 10.downTo(5)){ println(element) }

// for (element in 0..10){ println(element) }
}
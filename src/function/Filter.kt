package function

fun main() {
     val names = listOf("Osama", "Amal","Ahmed","Mohammed","sara", "Samar","Sayed","Samer")

    println(getFilterName(names,'s'))
}

fun getFilterName(names: List<String>, firstLater: Char)
    = names.filter { it[0] == firstLater}


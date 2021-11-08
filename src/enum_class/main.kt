package enum_class

fun main() {

    for (num in Numbers.values()) {
        println("${num.ordinal}:- ${num.name}:- ${num.isDouble}")
    }
}
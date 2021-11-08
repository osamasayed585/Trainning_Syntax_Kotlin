package enum_class

enum class Numbers(val isDouble: Boolean = false) {
    // it is such as listOf
    ONE,
    TWO(true),
    THREE,
    FOUR(true),
    FIVE;
}
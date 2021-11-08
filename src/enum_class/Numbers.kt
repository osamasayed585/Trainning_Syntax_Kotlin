package enum_class

enum class Numbers(val isDouble: Boolean = false) {
    ONE,
    TWO(true),
    THREE,
    FOUR(true),
    FIVE;
}
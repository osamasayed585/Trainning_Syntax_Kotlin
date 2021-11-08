package sealed_Class

sealed class SealedTest {

    open class A : SealedTest()

    open class B : SealedTest()
}
object C: SealedTest()
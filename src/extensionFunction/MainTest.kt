package extensionFunction

fun main() {

    val myName: String = "Osama"
    myName.printThree()

    val test = ImagePost("Hello","World")
    test.getLink()

    test.uploadImage()

}

fun String.printThree(){
    for (i in 1..3){
        println(this)
    }
}

fun ImagePost.getLink(){
    println(this.imageLink)
}
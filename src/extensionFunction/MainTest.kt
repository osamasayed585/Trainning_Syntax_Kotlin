package extensionFunction

fun main() {

    val myName: String = "Osama"
    myName.printThree()

    val test = ImagePost("Hello","World")
    test.getLink()

    test.uploadImage()

    // the beutiful of polymorphisim
    var post: ImagePost = ImagePost("Osama","I am learning kotlin")
    var secondPost: Post = Post("Ali","the beutiful of polymorphisim")

    // Once pass a parameter op type ImagePost or Post, it normal
    // why -> because ImagePost and post are extends from BasePost
    printPostDetails(post)

    // an anther ex
    val listOfPost = mutableListOf<BasePost>()
    listOfPost.add(secondPost)


}
// this is a fun her get a parameter of type BasePost
fun printPostDetails(mPost: BasePost){
    println(mPost.content)
}

fun String.printThree(){
    for (i in 1..3){
        println(this)
    }
}

fun ImagePost.getLink(){
    println(this.imageLink)
}
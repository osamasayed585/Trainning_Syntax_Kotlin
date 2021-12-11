package extensionFunction

abstract class BasePost(var name: String, content: String) {

    val comments = mutableListOf<String>()

    var likeCount = 0
        private set

    var commentsCount = 0
        private set
        get() = comments.size

    fun like(){
        this.likeCount++
        println("have a new like.")
    }

    fun addComment(comment: String){
        comments.add(comment)
    }

    open fun uploadImage(){
        println("Hello dear.!")
    }

    abstract fun editPost()

}
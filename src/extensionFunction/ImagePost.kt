package extensionFunction

class ImagePost( name: String, content: String): BasePost(name, content){

    var imageLink: String = "www.image.com"

    override fun uploadImage() {
        super.uploadImage()
        println("Plz upload a new Image")
    }

    override fun editPost() {
        // to do anyThing here
    }
}
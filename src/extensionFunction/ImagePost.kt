package extensionFunction

class ImagePost( name: String, content: String): Post(name, content){

    var imageLink: String = "www.image.com"


    override fun uploadImage() {
        super.uploadImage()
        println("Plz upload a new Image")
    }
}
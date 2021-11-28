package singleton
// when add keyword "object" before class name, if this is be a Singleton class
object Settings {

    var language: String = "Arabic"
    private set

    var theme: String = "Dark"
    private set

    fun changeThemeToLight(){ theme = "Light" }
    fun changeThemeToDark(){ theme = "Dark" }

    fun changeLanguageToEnglish(){ language = "English" }
    fun changeLanguageToArabic(){ language = "Arabic" }
}
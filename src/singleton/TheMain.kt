package singleton

fun main() {
    println(Settings.language)
    println(Settings.theme)
    println("___________After change______________")
    Settings.changeLanguageToEnglish()
    Settings.changeThemeToLight()
    println(Settings.language)
    println(Settings.theme)
}
fun main() {
    val userSettings: Map<String, String> = mapOf(
        "name" to "Catrina",
        "language" to "Español",
        "logo" to "logo.png",
        "website" to "www.site.com"
    )
    
    userSettings.put("name", "la maquina del tiempo")
    // if("Español" in userSettings.values){
    //     println("funciona")
    // }else{
    //     println("no funciona")
    // }

    println(userSettings.values)
    // {name=Catrina, language=Español, logo=logo.png, website=www.site.com}
}
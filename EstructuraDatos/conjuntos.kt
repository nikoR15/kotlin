fun main(){
    var numeros: MutableSet<String> = mutableSetOf<String>();
    numeros.add("uno")
    numeros.add("dos")
    numeros.add("dos")
    numeros.add("cuatro")

    for (i in numeros) {
    println(i);     
    }
}
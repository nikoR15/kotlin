fun main(){
    println("¿tiene cas? ")
    var casa:String = readLine()!!.toString();

    if(casa == "si"){
        println("¿que barrio vive?")
        var barrio:String = readLine()!!.toString();
        if(barrio == "nuevo armenia" || barrio == "colinas" || barrio == "ciudad dorada"){
            println("Su estrato es 1")
        }else{
            println("Su estrato es 3")
        }
    }else{
        println("No tiene casa")
    }
}
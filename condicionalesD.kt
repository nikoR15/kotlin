fun main(){
    println("ingrese la nota 1: ")
    var note1 = readLine()!!.toDouble()
    println("ingrese la nota 2: ")
    var note2 = readLine()!!.toDouble()
    println("ingrese la nota 3: ")
    var note3 = readLine()!!.toDouble()
    var prom = (note1+note2+note3)/3

    if(note1 < 0 || note1 > 5 || note2 < 0 || note2 > 5 || note3 < 0 || note3 > 5){
        println("el rango de notas debe de estar en el rango de 0 a 5")
    }else if(prom>=3.5){
        println("Gano la materia")
    }else{
        println("Pierde la materia")
    }
}
fun main(){
    println("cuantas veces quiere repetir el ciclo ")
    var veces = readLine()!!.toInt()

    for (i in 1..veces) {
        println("ingrese su nombre: ")
        var nombre = readLine()!!.toString()
        println("ingrese su primer nota ")
        var nota1 = readLine()!!.toDouble()
        println("ingrese su segunda nota ")
        var nota2 = readLine()!!.toDouble()
        println("ingrese su tercera nota ")
        var nota3 = readLine()!!.toDouble()

        while(nota1 < 0 || nota1 > 5 || nota2 < 0 || nota2 > 5 || nota3 < 0 || nota3 > 5){
            print("solo se pueden notas en el rango de 0 a 5 \n")
            println("ingrese su primer nota ")
            nota1 = readLine()!!.toDouble()
            println("ingrese su segunda nota ")
            nota2 = readLine()!!.toDouble()
            println("ingrese su tercera nota ")
            nota3 = readLine()!!.toDouble()
        }
        var prom = (nota1+nota2+nota3)/3
            if(prom >= 4.3){
                print("Ganaste la materia y ganaste con honores")
            }else if(prom >= 3.5){
                print("ganaste la materia")
            }else if(prom >= 2.5 || prom <= 3.4){
                print("perdiste la materia pero puedes recuperar")
            }else if(prom <= 2.4){
                print("perdiste la materia y no puedes recuperar")
            }
            print("su nombre es $nombre y su promedio es $prom ")
    }
}
fun main(){
    print("ingrese un numero del 1 al 10: ")
    var number = readLine()!!.toInt();

    if(number < 1 || number > 10 ){
        println("El numero debe de estar en el rango del 1 al 10 ")
    }else{
        println("este es tu numero $number")
    }
}
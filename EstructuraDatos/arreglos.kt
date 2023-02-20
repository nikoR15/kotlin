fun main(){
    var numeroM = IntArray(3);
    print("Ingrese el primer dato : ")
    var numero1 = readLine()!!.toInt();
    numeroM[0] = numero1;
    // println(numeroM)
    print("Ingrese el segundo dato : ")
    var numero2 = readLine()!!.toInt();
    numeroM[2] = numero2;
    // println(numeroM)
    print("Ingrese el tercer dato : ")
    var numero3 = readLine()!!.toInt();
    numeroM[1] = numero3;

    var max = numeroM.maxOrNull()
    var min = numeroM.minOrNull()
    for (i in numeroM) {
        println(i)
    }
    println(max)
    println(min)
}
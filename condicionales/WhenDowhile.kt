fun main(){
    var saldo = 55000
    println("Escriba su contraseña: ")
    var contraseña:Int = readLine()!!.toInt()
    var contraseñaQuemada = 123

    var menu:String = "Menu\n"
    menu+="1. Retirar\n"
    menu+="2. Depositar\n"
    menu+="3. Ver saldo\n"
    menu+="Elija una opción"

    if(contraseña == contraseñaQuemada){
        do {
            print(menu)
            var menu1 = readLine()!!.toInt()
            when(menu1){
                1 ->{
                    print("que monto desea retirar: ")
                    var montoR = readLine()!!.toInt()
                    if(montoR > saldo){
                        print("No tiene suficiente saldo")
                    }else if(montoR < 0 ){
                        print("No tiene saldo")
                    }else if(montoR > 0 && montoR < saldo){
                        var resultadoR = saldo-montoR
                        print("Acabas de retirar: "+montoR)
                        print("Saldo restante: $resultadoR")
                    }
                }2 -> {
                    print("que monto desea depositar: ")
                    var montoD = readLine()!!.toInt()
                    if(montoD < 0 ){
                        print("esta acción no se puede realizar")
                    }else if (montoD > 0 ){
                        var resultadoD = saldo + montoD
                        print("Acabas de depositar: "+montoD)
                        print("Saldo restante: $resultadoD")
                    }
                }3 -> print(saldo)
            }
        }while(menu1 > 3 || menu1 < 1)
    }else{
        print("Contraseña incorrecta")
    }
}
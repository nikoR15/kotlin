fun main(){
    var listaNombre = mutableListOf<String>()
    print("Ingrese el primer nombre: ")
    var primerNombre = readLine()!!.toString();
    listaNombre.add(primerNombre) ;
    // println(numeroM)
    print("Ingrese el primer nombre: ")
    var segundoNombre = readLine()!!.toString();
    listaNombre.add(segundoNombre) ;
    // println(numeroM)
    print("Ingrese su primer apellido: ")
    var primerApellido= readLine()!!.toString();
    listaNombre.add(primerApellido);
    // println(numeroM)
    print("Ingrese el segundo apellido: ")
    var segundoApellido = readLine()!!.toString();
    listaNombre.add(segundoApellido) ;
    println(listaNombre)
    for (i in listaNombre) {
        println(i)
    }
}
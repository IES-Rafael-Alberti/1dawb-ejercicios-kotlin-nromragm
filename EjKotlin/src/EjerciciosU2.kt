fun ejCon_02() {
    val password = "password"
    println("Introduce la contraseña: ")
    val passwordUsuario = readln()
    if (password != passwordUsuario) {
        println("Contraseña incorrecta.")
    }
    else {
        println("Contraseña correcta.")
    }

}

fun ejCon_03() {
    println("Introduce un numero: ")
    val num = readln().toInt()
    println("Introduce el divisor: ")
    val divisor = readln().toInt()
    val resultado = num/divisor
    print("El resultado de la division es: $resultado")

}

fun ejCon_06() {
    println("Introduce tu nombre: ")
    val nombre = readln()
    println("Introduce tu sexo (M para mujer, H para hombre): ")
    val sexo = readln().uppercase()
    if (sexo == "M" && nombre.uppercase() < "M") {
        println("Perteneces al grupo: A")
    }
    else if (sexo == "H" && nombre.uppercase() > "N") {
        println("Perteneces al grupo: A")
    }
    else {
        println("Perteneces al grupo: B")
    }

}

fun ejCon_08() {
    println("Introduce tu nombre: ")
    val nombre = readln()
    println("Introduce tu sexo (M para mujer, H para hombre): ")
    val sexo = readln().uppercase()
    if (sexo == "M" && nombre.uppercase() < "M") {
        println("Perteneces al grupo: A")
    }
    else if (sexo == "H" && nombre.uppercase() > "N") {
        println("Perteneces al grupo: A")
    }
    else {
        println("Perteneces al grupo: B")
    }

}



fun ejIt_02() {
    print("Introduce tu edad: ")
    var edad = readln().toInt()
    var resultado = ""
    while (edad <= 0) {
        print("Introduce una edad valida: ")
        edad = readln().toInt()

    }
    for (i in 1..edad) {
        resultado += "$i\n"
    }
    println("Años cumplido:")
    println(resultado)
}

fun ejIt_04() {
    print("Introduce un numero entero positivo: ")
    var num = readln().toInt()
    if (num < 0){
        println("Numero no valido")
    }
    while (num > 0) {
        print("$num, ")
        num--
    }
    print("0.")
}


fun ejIt_06() {
    print("Introduce un numero entero positivo: ")
    val num = readln().toInt()
    if (num < 0){
        println("Numero no valido")
    }
    else {
        for (i in 1..num) {
            println("*".repeat(i))
        }
    }
}

fun ejIt_07() {

    for (i in 1..10) {
        println("Tabla del $i:\n")

        for (j in 1..10) {
            val resultado = i * j
            println("$i x $j = $resultado")
        }
        if (i != 10) {
            println("")
            println("")
        }
    }
}

fun ejIt_08() {
    print("Introduce un numero entero positivo: ")
    val num = readln().toInt()
    if (num < 0){
        println("Numero no valido")
    }
    else {
        for (i in 1..num step 2) {
            for (j in i downTo 1 step 2) {
                print("$j ")
            }
            println()
        }
    }
}


fun ejIt_13() {
    print("Introduce algo (salir para terminar): ")
    var x = readln()
    while (x != "salir"){
        println(x)
        x = readln()
    }
}

fun ejIt_15() {
    print("Introduce numeros enteros: ")
    var salir = false
    var suma = 0

    while (!salir) {
        val numero = readln().toInt()

        if (numero == 0) {
            salir = true
        } else if (numero > 0) {
            suma += numero
        }
    }
    println("La suma de los numeros positivos introducidos es: $suma")
}

fun ejIt_18() {
    print("Introduce numeros enteros positivos (-1 para salir): ")
    var salir = false
    var numerosPares = 0

    while (!salir) {
        var suma = 0
        val numero = readln().toInt()

        if (numero == -1) {
            salir = true
        } else if (numero > 0) {
            for (i in numero.toString()) {
                suma += i.toString().toInt()
            }
            println("La suma de los digitos es: $suma")
            if (suma % 2 == 0){
                numerosPares += 1
            }
        }
    }
    println("Se ntroducieron $numerosPares numeros pares.")
}


fun ejIt_19() {
    var salir = false

    while (!salir) {
        println("Menu:")
        println("1- Comenzar programa")
        println("2- Imprimir listado")
        println("3- Finalizar programa")

        print("Seleccione una opcion (1, 2 o 3): ")
        val opcion = readLine().toString()

        when (opcion) {
            "1" -> println("El programa ha comenzado")
            "2" -> println("Lista de elementos: Agua, Pan")
            "3" -> {
                println("Programa finalizado.")
                salir = true
            }

            else -> println("Opcion incorrecta. Seleccione una opcion valida (1, 2 o 3).")
        }
    }
}

fun ejIt_25() {
    print("Introduce una frase: ")
    val frase = readln()
    val palabras = frase.split(" ")
    val numeroPalabras = palabras.size
    var palabraMasLarga = ""
    for (palabra in palabras) {
        if (palabra.length > palabraMasLarga.length) {
            palabraMasLarga = palabra
        }
    }
    println("La palabra más larga es: $palabraMasLarga")
    println("Hay un total de $numeroPalabras palabras")
}
fun ejListTup_04() {
    val numerosGanadores = mutableListOf<Int>()

    for (i in 1..6) {
        var salir = false
        while (!salir) {
            try {
                print("Introduce el $i número ganador del 1 al 49: ")
                val numero = readlnOrNull()?.toInt()
                if (numero != null) {
                    if (numero < 0 || numero > 49) {
                        throw NumberFormatException()
                    } else {
                        if (numero !in numerosGanadores) {
                            numerosGanadores.add(numero)
                            salir = true
                        } else {
                            println("Error, numero repetido")
                        }
                    }
                }
            } catch (e: NumberFormatException) {
                println("Introduce un numero valido")
            }
        }
    }

    numerosGanadores.sort()
    println("Números ganadores ordenados:")
    for (i in numerosGanadores.indices) {
        println(numerosGanadores[i])
    }
}

fun ejListTup_06() {
    val asignaturas = listOf("Matemáticas", "Física", "Química", "Historia", "Lengua")
    val suspendidas = mutableListOf<String>()

    for (asignatura in asignaturas) {
        var salir = false
        while (!salir) {
            try {
                print("Introduce la nota de $asignatura: ")
                val nota = readln().toInt()
                if (nota < 0 || nota > 10) {
                    throw NumberFormatException()
                } else {
                    salir = true
                    if (nota < 5) {
                        suspendidas.add(asignatura)
                    }
                }
            } catch (e: NumberFormatException) {
                println("Introduce una nota válida")
            }
        }
    }
    if (suspendidas.isEmpty()) {
        println("No has suspendido ninguna asignatura")
    } else {
        println("Asignaturas suspendidas: ${suspendidas.joinToString(", ")}")
    }
}

fun ejListTup_08() {
    print("Introduce una palabra: ")
    val palabra = readLine().toString().lowercase()

    if (palabra == palabra.reversed()) {
        println("$palabra es un palíndromo")
    } else {
        println("$palabra no es un palíndromo")
    }
}

fun ejListTup_09() {
    print("Introduce una palabra: ")
    val palabra = readLine().toString().lowercase()
    var a = 0
    var i = 0
    var e = 0
    var o = 0
    var u = 0
    for (vocal in palabra) {
        when (vocal) {
            'a' -> a++
            'e' -> e++
            'i' -> i++
            'o' -> o++
            'u' -> u++
        }
    }

    println("La palabra: $palabra tiene $a 'a', $e 'e', $i 'i', $o 'o', $u 'u'")
}
fun ejListTup_10() {
    val precios = listOf(50, 75, 46, 22, 80, 65, 8)
    println(precios.min())
    println(precios.max())
}

fun ejListTup_13() {
    val vector1 = listOf(1, 2, 3)
    val vector2 = listOf(-1, 0, 2)

    val resultado = vector1.zip(vector2).sumOf { (x, y) -> x * y }

    println("El producto escalar de los vectores $vector1 y $vector2 es: $resultado")
}


fun ejDicc_03() {
    val frutas = mapOf("Platano" to 1.35, "Manzana" to 0.80, "Pera" to 0.85, "Naranja" to 0.70)
    var salir = false
    var fruta: String
    var kg: Int

    while (!salir) {
        try {
            print("Introduce la fruta: ")
            fruta = readLine()?.capitalize() ?: ""
            print("Introduce la cantidad de kilos: ")
            kg = readLine()?.toInt() ?: 0

            if (fruta in frutas && kg >= 0) {
                salir = true
                val precio = kg * frutas[fruta]!!
                println("El precio de $kg kg de $fruta es $precio$")

            } else {
                throw NumberFormatException()
            }
        } catch (e: NumberFormatException) {
            println("Introduce una fruta o kg válidos")
        }
    }
}

fun ejDicc_05() {
    val creditosAsignaturas = mapOf("Matemáticas" to 6, "Física" to 4, "Química" to 5)
    var totalCreditos = 0

    for ((asignatura, creditos) in creditosAsignaturas) {
        println("$asignatura tiene $creditos créditos")
        totalCreditos += creditos
    }
    println("El número total de créditos es $totalCreditos.")
}
fun ejDicc_06() {

    val diccionario = mutableMapOf<String, Any>()
    var salir = false

    while (!salir){
        print("Tipo de dato que quieres introducir (nombre, edad, sexo...) o escribe x para salir): ")
        val tipo = readln()

        if (tipo == "x"){
            salir = true
        }
        else{
            print("Introduce el dato: ")
            val dato = readln()
            diccionario[tipo] = dato
            println(diccionario)
        }
    }
}

fun ejDicc_07() {
    val cestaCompra = mutableMapOf<String, Double>()
}

fun ejDicc_08() {
    println("Introduce las palabras en español e ingles separadas por dos puntos (ejemplo: casa:house, perro:dog)")
    val entrada = readLine() ?: ""

    val dosPalabras = entrada.split(", ")
    val diccionario = mutableMapOf<String, String>()

    for (i in dosPalabras) {
        val partes = i.split(":")
        if (partes.size == 2) {
            diccionario[partes[0]] = partes[1]
        }
    }

    println("Palabras en el diccionario:")
    diccionario.forEach { (espanol, ingles) -> println("$espanol:$ingles") }

    println("\nIntroduce una frase en español para traducirla:")
    val frase = readLine() ?: ""

    val palabras = frase.split(" ")
    val fraseTraducida = mutableListOf<String>()

    for (palabra in palabras) {
        val traduccion = diccionario[palabra] ?: palabra
        fraseTraducida.add(traduccion)
    }

    println("\nFrase traducida:")
    println(fraseTraducida.joinToString(" "))
}

fun ejDicc_10() {

}

fun ejDicc_11() {
    val directorioTexto = "nif;nombre;email;teléfono;descuento\n01234567L;Luis González;luisgonzalez@mail.com;656343576;12.5\n71476342J;Macarena Ramírez;macarena@mail.com;692839321;8\n63823376M;Juan José Martínez;juanjo@mail.com;664888233;5.2\n98376547F;Carmen Sánchez;carmen@mail.com;667677855;15.7"
    val lineas = directorioTexto.split('\n')
    val nombresCampos = lineas[0].split(';')
    val directorioClientes = mutableMapOf<String, Map<String, String>>()

    for (linea in lineas.subList(1, lineas.size)) {
        if (linea.isNotBlank()) {
            val valores = linea.split(';')
            val clienteInfo = mutableMapOf<String, String>()
            for (i in nombresCampos.indices) {
                clienteInfo[nombresCampos[i]] = valores[i]
            }
            directorioClientes[valores[0]] = clienteInfo
        }
    }
    for ((nif, clienteInfo) in directorioClientes) {
        println()
        for ((campo, valor) in clienteInfo) {
            println("${campo.capitalize()}: $valor")
        }
    }
}


fun ejConj_01() {
    val compras = mutableListOf(
        listOf("Nuria Costa", 5, 12780.78, "Calle Las Flores 355"),
        listOf("Jorge Russo", 7, 699.0, "Mirasol 218"),
        listOf("Nuria Costa", 7, 532.90, "Calle Las Flores 355"),
        listOf("Julián Rodriguez", 12, 5715.99, "La Mancha 761"),
        listOf("Jorge Russo", 15, 958.0, "Mirasol 218")
    )
    val domiciliosFacturacion = mutableMapOf<String, MutableSet<String>>()

    for (compra in compras) {
        val (cliente, _, _, domicilio) = compra

        if (!domiciliosFacturacion.containsKey(cliente)) {
            domiciliosFacturacion[cliente.toString()] = mutableSetOf()
        }

        domiciliosFacturacion[cliente]?.add(domicilio.toString())
    }
    for ((cliente, domicilios) in domiciliosFacturacion) {
        println("Cliente: $cliente, Domicilios para factura: ${domicilios.joinToString(", ")}")
    }

}
fun ejConj_02() {
    val alumnosPrimaria = mutableListOf<String>()
    var salir = false
    while (!salir) {
        print("Introduce el nombre de los alumnos de primaria (escribe x para terminar): ")
        val nombre = readLine().toString().trim()
        if (nombre == "x") {
            salir = true
        } else {
            alumnosPrimaria.add(nombre)
        }
    }

    val alumnosSecundaria = mutableListOf<String>()
    var salir2 = false
    while (!salir2) {
        print("Introduce el nombre de los alumnos de secundaria (escribe x para terminar): ")
        val nombre = readLine().toString().trim()
        if (nombre == "x") {
            salir2 = true
        } else {
            alumnosSecundaria.add(nombre)
        }
    }
    println("Nombres sin repeticiones:")
    println(alumnosPrimaria + alumnosSecundaria)

    val repetidos = alumnosPrimaria.toSet() intersect alumnosSecundaria.toSet()
    println("Nombres que se repiten entre primaria y secundaria:")
    println(repetidos)

    val noRepetidos = alumnosPrimaria.toSet() - alumnosSecundaria.toSet()
    println("Nombres de primaria que no se repiten en secundaria:")
    println(noRepetidos)


}

fun ejConj_03() {
    val conjuntoOriginal = setOf(6, 1, 4)
    val listaPotencia = mutableListOf<Set<Int>>(emptySet())

    for (elemento in conjuntoOriginal) {
        val nuevosSubconjuntos = mutableListOf<Set<Int>>()
        for (subconjunto in listaPotencia) {
            nuevosSubconjuntos.add(subconjunto + elemento)
        }
        listaPotencia.addAll(nuevosSubconjuntos)
    }
    println(listaPotencia)

}
fun ejConj_04() {
    val setFrutas1 = setOf("manzana", "pera", "naranja", "plátano", "uva")
    val setFrutas2 = setOf("manzana", "pera", "durazno", "sandía", "uva")

    val frutasComunes = setFrutas1.intersect(setFrutas2)
    println("Frutas comunes: $frutasComunes")

    val frutasSoloEnFrutas1 = setFrutas1 - setFrutas2
    println("Frutas que están en frutas1 pero no en frutas2: $frutasSoloEnFrutas1")

    val frutasSoloEnFrutas2 = setFrutas2 - setFrutas1
    println("Frutas que están en frutas2 pero no en frutas1: $frutasSoloEnFrutas2")
}

fun ejConj_05() {
    val numeros = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val pares = numeros.filter { it % 2 == 0 }.toSet()
    val multiplosDeTres = numeros.filter { it % 3 == 0 }.toSet()
    val paresMultiplosDeTres = pares.intersect(multiplosDeTres)

    println("Conjunto de pares: $pares")
    println("Conjunto de múltiplos de tres: $multiplosDeTres")
    println("Intersección entre pares y múltiplos de tres: $paresMultiplosDeTres")
}

fun ejConj_06() {
    val vocales = setOf('a', 'e', 'i', 'o', 'u')
    val abc = ('a'..'z').toSet()

    val consonantes = abc - vocales
    val letrasComunes = vocales.intersect(consonantes)

    println("Conjunto de consonantes: $consonantes")
    println("Conjunto de letras comunes: $letrasComunes")
}


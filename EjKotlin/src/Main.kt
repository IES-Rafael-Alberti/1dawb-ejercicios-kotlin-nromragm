fun main() {
    ejU1_18()
 /*   var op: Int

    do {

        limpiaConsola()
        mostrarMenuPpal()
        op = pedirOpcion(0, 3)

        if (op != 0) {
            mostrarMenu(op)
        }

    } while (op != 0)

}


fun mostrarMenuPpal() {
    println("1. Ejercicios U1")
    println("2. Ejercicios U2")
    println("3. Ejercicios U3")
}

fun mostrarMenu(tipo: Int) {
    var op = -1

    do {
        limpiaConsola()
        when (tipo) {
            1 -> {
                println("1. Ejercicio 04")
                println("2. Ejercicio 06")
                println("3. Ejercicio 12")
                println("4. Ejercicio 15")
                println("5. Ejercicio 18")
                println("6. Ejercicio 20")
                println("7. Ejercicio 21")
                println("8. Ejercicio 22")
                println("9. Ejercicio 24")
                println("10. Ejercicio 25")
                println("11. Ejercicio 26")
                println("12. Ejercicio 27")

                op = pedirOpcion(0, 12)
                when (op) {
                    1 -> ejU1_04()
                    2 -> ejU1_06()
                    3 -> ejU1_12()
                    4 -> ejU1_15()
                    5 -> ejU1_18()
                    6 -> ejU1_20()
                    7 -> ejU1_21()
                    8 -> ejU1_22()
                    9 -> ejU1_24()
                    10 -> ejU1_25()
                    11 -> ejU1_26()
                    12 -> ejU1_27()
                }
            }

            2 -> {
                println("1. EjCondicion 02")
                println("2. EjCondicion 03")
                println("3. EjCondicion 06")
                println("4. EjCondicion 08")
                println("5. EjCondicion 10")
                println("6. EjIterativa 02")
                println("7. EjIterativa 04")

                op = pedirOpcion(0, 7)
                when (op) {
                    1 -> ejemplo3()
                    2 -> ejemplo3()
                    3 -> ejemplo3()
                    4 -> ejemplo3()
                    5 -> ejemplo3()
                    6 -> ejemplo3()
                    7 -> ejemplo3()
                }
            }

            3 -> {
                println("1. Listas 04")
                println("2. Listas 06")
                println("3. Diccionario 03")

                op = pedirOpcion(0, 3)
                when (op) {
                    1 -> ejemplo2()
                    2 -> ejemplo2()
                    3 -> ejemplo2()
                }
            }
        }
    } while (op != 0)

}

/**
 * Pedir una opción del menú
 * @param min Opción mínima
 * @param max Opción máxima
 */
fun pedirOpcion(min: Int, max: Int): Int {

    var opcion: Int
    var error = false

    do {
        print("Seleccione opción (0 = SALIR) >> ")
        opcion = try {
            readln().toInt()
        } catch (ex: NumberFormatException) {
            error = true
            -1
        }

        if (error || opcion !in min..max) {
            mensajeError(1)
            error = false
        }
    } while (opcion !in min..max)

    return opcion
}

fun mensajeError(id: Int) {
    when (id) {
        1 -> println("**Opción no válida**")
        else -> {
            println("**Error desconocido**")
        }
    }
}

fun limpiaConsola() {
    for (i in 1..20) {
        println()
    }

  */
}

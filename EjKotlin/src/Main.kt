fun main() {
var op: Int

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
                println("8. EjIterativa 06")
                println("9. EjIterativa 07")
                println("10. EjIterativa 08")
                println("11. EjIterativa 13")
                println("12. EjIterativa 15")
                println("13. EjIterativa 18")
                println("14. EjIterativa 19")
                println("15. EjIterativa 25")


                op = pedirOpcion(0, 15)
                when (op) {
                    1 -> ejCon_02()
                    2 -> ejCon_03()
                    3 -> ejCon_06()
                    4 -> ejCon_08()
                    5 -> ejCon_08()
                    6 -> ejIt_02()
                    7 -> ejIt_04()
                    8 -> ejIt_06()
                    9 -> ejIt_07()
                    10 -> ejIt_08()
                    11 -> ejIt_13()
                    12 -> ejIt_15()
                    13 -> ejIt_18()
                    14 -> ejIt_19()
                    15 -> ejIt_25()
                }
            }

            3 -> {
                println("1. Listas 04")
                println("2. Listas 06")
                println("3. Listas 08")
                println("4. Listas 09")
                println("5. Listas 10")
                println("6. Listas 13")
                println("7. Diccionario 03")
                println("8. Diccionario 05")
                println("9. Diccionario 06")
                println("10. Diccionario 07")
                println("11. Diccionario 08")
                println("12. Diccionario 10")
                println("13. Diccionario 11")
                println("14. Conjuntos 1")
                println("15. Conjuntos 2")
                println("16. Conjuntos 3")
                println("17. Conjuntos 4")
                println("18. Conjuntos 5")
                println("19. Conjuntos 6")

                op = pedirOpcion(0, 19)
                when (op) {
                    1 -> ejListTup_04()
                    2 -> ejListTup_06()
                    3 -> ejListTup_08()
                    4 -> ejListTup_09()
                    5 -> ejListTup_10()
                    6 -> ejListTup_13()
                    7 -> ejDicc_03()
                    8 -> ejDicc_05()
                    9 -> ejDicc_06()
                    10 -> ejDicc_07()
                    11 -> ejDicc_08()
                    12 -> ejDicc_10()
                    13 -> ejDicc_11()
                    14 -> ejConj_01()
                    15 -> ejConj_02()
                    16 -> ejConj_03()
                    17 -> ejConj_04()
                    18 -> ejConj_05()
                    19 -> ejConj_06()

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
}

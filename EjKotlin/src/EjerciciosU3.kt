fun main(){
    ejListTup_04()
}

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



fun pedirEdad(): Int {
    var salir = false
    var entrada: String
    var edad: Int

    while (!salir) {
        print("Introduzca su edad: ")
        entrada = readLine() ?: ""

        if (entrada.isNumeric() && entrada.toInt() > 0) {
            salir = true
        } else {
            println("La edad introducida no es válida.")
        }
    }

    edad = entrada.toInt()
    return edad
}

fun añosCumplidos(edad: Int): String {
    var resultado = ""
    for (i in 1..edad) {
        resultado += "$i\n"
    }
    return resultado
}

fun main() {
    val edad = pedirEdad()
    println(añosCumplidos(edad))
}

fun String.isNumeric(): Boolean {
    return this.matches("-?\\d+".toRegex())
}

import java.util.*

fun ejU1_04() {
    println("Ingrese la temperatura en grados Celsius: ")
    val celsius: Float = readln().toFloat()
    val fahrenheit: Float = (celsius * 9/5) + 32

    println("$celsius grados Celsius es igual a $fahrenheit grados Fahrenheit.")
}

fun ejU1_06() {
    println("Ingrese el importe final del articulo: ")
    val importeFinal: Float = readln().toFloat()
    val iva = importeFinal * 0.1
    val importeSinIva: Double = importeFinal - iva

    println("El importe sin IVA es: $importeSinIva.")
    println("El IVA pagado es: $iva€")
}

fun ejU1_12() {
    println("Ingrese su peso en kg: ")
    val peso: Float = readln().toFloat()

    println("Ingrese su estatura en metros: ")
    val estatura: Float = readln().toFloat()

    val imc = peso / (estatura * estatura)
    val imcRedondeado = String.format("%.2f", imc)

    println("Tu índice de masa corporal es $imcRedondeado.")
}

fun ejU1_15(){
    print("Ingrese la cantidad de dinero depositada en la cuenta de ahorros:  ")
    try {
        val capitalInicial = readln().toFloat()
        val intereses = (1 + 0.04)

        val primerAno = capitalInicial * intereses
        val segundoAno = primerAno * intereses
        val tercerAno = segundoAno * intereses

        val primerAnoRedondeado = String.format("%.2f", primerAno)
        val segundoAnoRedondeado = String.format("%.2f", segundoAno)
        val tercerAnoRedondeado = String.format("%.2f", tercerAno)


        println("Ahorros despues del primer año: $primerAnoRedondeado")
        println("Ahorros despues del segundo año: $segundoAnoRedondeado")
        println("Ahorros despues del año: $tercerAnoRedondeado")
    }
    catch (e: Exception){
        print("Error, numero no valido")
    }
}

fun ejU1_18() {
    println("Escribe tu nombre completo: ")
    val nombre = readln()

    println("Nombre completo en minúsculas: ${nombre.lowercase()}")
    println("Nombre completo en mayúsculas: ${nombre.uppercase()}")
    println("Nombre completo con iniciales en mayúsculas: ${nombre.replaceFirstChar {
        if (it.isLowerCase()) it.titlecase(
            Locale.getDefault()
        ) else it.toString()
    }}")
}


fun ejU1_20() {
    println("Escribe un número de teléfono en formato +34-XXXXXXXXXX-XX: ")
    val telefono = readln()
    val partes = telefono.split("-")
    val numeroSinPrefijo = partes[1]

    println("Número de teléfono sin prefijo: $numeroSinPrefijo")

}

fun ejU1_21() {
    println("Escribe una frase: ")
    val frase = readln()
    val fraseInvertida = frase.reversed()

    println("Frase invertida: $fraseInvertida")
}

fun ejU1_22() {
    println("Escribe una frase: ")
    val frase = readln()

    println("Escribe una vocal: ")
    val vocal = readln()

    val vocalMayuscula = vocal.uppercase()
    val fraseConVocalMayuscula = frase.replace(vocal, vocalMayuscula)

    println("Frase con la vocal en mayúscula: $fraseConVocalMayuscula")
}


fun ejU1_24() {
    println("Escribe el precio del producto con dos decimales: ")
    val precio = readln().toFloat()
    val euros = precio.toInt()
    val centimos = ((precio - euros) * 100).toInt()

    println("Número de euros: $euros")
    println("Número de centimos: $centimos")
}


fun ejU1_25() {
    println("Escribe tu fecha de nacimiento (dd/mm/aaaa): ")
    val fecha = readln()
    val partesFecha = fecha.split("/")
    val dia = partesFecha[0]
    val mes = partesFecha[1]
    val ano = partesFecha[2]

    println("Dia: $dia")
    println("Mes: $mes")
    println("Año: $ano")
}

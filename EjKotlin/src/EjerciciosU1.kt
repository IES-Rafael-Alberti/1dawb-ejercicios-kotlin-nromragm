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

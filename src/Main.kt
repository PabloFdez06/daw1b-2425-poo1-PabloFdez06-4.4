fun main() {

    try {
        val coche1 = Coche("","Nissan", "Nissan cascai", null, 4, "A48JRSP")
        println(coche1) // lanza excepcion tanto en color como en numCaballos*/
    }catch (e: IllegalArgumentException) {
        println("ERROR: ${e.message}")
    }

    try {
        val coche2 = Coche("Azul","Mercedes", "Nissan cascai", 67, 4, "A48JRSP")
        println(coche2) // Lanza excepción correctamente cuando el número de caballos es inferior a 70 o superior a 700*/
    }catch (e: IllegalArgumentException) {
        println("ERROR: ${e.message}")
    }

    try {
        val coche3 = Coche("Rojo","BMW", "X4", 80, 2, "A48JRSP")
        println(coche3) // Lanza excepción correctamente cuando el número de puertas no está entre 3 y 5*/
    }catch (e: IllegalArgumentException) {
        println("ERROR: ${e.message}")
    }

    try {
        val coche4 = Coche("Verde","Audi", "RS7", 80, 2, "A48JR")
        println(coche4) // Lanza excepción correctamente cuando la matrícula no contiene 7 caracteres*/
    }catch (e: IllegalArgumentException) {
        println("ERROR: ${e.message}")
    }

    try {
        val coche4 = Coche("Verde","audi", "r8", 458, 3, "A4890JR")
        println(coche4) // FUNCIONA CORRECTAMENTE, Y COMPROBANDO LA FUNCIONALIDAD DE MARCAMAYUSC Y MODELOMAYUSC*/
    }catch (e: IllegalArgumentException) {
        println("ERROR: ${e.message}")
    }
}
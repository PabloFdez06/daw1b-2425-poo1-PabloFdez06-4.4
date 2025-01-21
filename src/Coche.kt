class Coche(var color: String?,
            private val marca: String?,
            private val modelo: String?,
            private val numCaballos: Int?,
            private val numPuertas: Int?,
            private val matricula: String?) {


/*    var matricula: String = matricula // se puede hacer o con un setter o con require, preguntar cual seria mas correcta
        set(value){
            require(value.length == 7){"La matrícula debe tener 7 caracteres."}
            field = value
        }*/

    val marcaMayusc: String
        get() = marca!!.replaceFirstChar { it.uppercase() }

    val modeloMayusc: String
        get() = modelo!!.replaceFirstChar { it.uppercase() }

    init {
        require(!color.isNullOrEmpty()){"El color no puede ser nulo!"}
        require(!marca.isNullOrEmpty()){"El coche debe tener una marca asignada!"}
        require(!modelo.isNullOrEmpty()){"El coche debe tener un modelo asignado!"}
        require(numCaballos != null){"El número de caballos no puede ser nulo!"}
        require(numPuertas != null){"El número de puertas no puede ser nulo!"}
        require(!matricula.isNullOrEmpty() && matricula.length == 7){"La matrícula debe tener 7 caracteres!"}
        require(numCaballos in 70..700){"El número de caballos debe estár entre 70 y 700 caballos"}
        require(numPuertas in 3..5){"El número de puertas debe estár entre 3 y 5"}
    }

    override fun toString(): String {
        return "MARCA: $marcaMayusc, MODELO: $modeloMayusc, COLOR: $color, CABALLOS: $numCaballos HP, PUERTAS: $numPuertas, MATRÍCULA: $matricula."
    }
}
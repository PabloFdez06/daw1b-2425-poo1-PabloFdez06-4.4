class Coche(var color: String?,
            marca: String?,
            modelo: String?,
            private val numCaballos: Int?,
            private val numPuertas: Int?,
            private val matricula: String?) {


/*    var matricula: String? = matricula
        set(value){
            require(value?.length == 7){"La matrícula debe tener 7 caracteres."}
            field = value
        }*/

    private var marca: String?
        get() = field?.replaceFirstChar { it.uppercase() } ?: ""
        private set


    private var modelo: String?
        get() = field?.replaceFirstChar { it.uppercase() }?: ""
        private set

    init {
        require(!color.isNullOrEmpty()){"El color no puede ser nulo!"}
        require(!marca.isNullOrEmpty()){"El coche debe tener una marca asignada!"}
        require(!modelo.isNullOrEmpty()){"El coche debe tener un modelo asignado!"}
        require(numCaballos != null){"El número de caballos no puede ser nulo!"}
        require(numPuertas != null){"El número de puertas no puede ser nulo!"}
        require(!matricula.isNullOrEmpty() && matricula.length == 7){"La matrícula debe tener 7 caracteres!"}
        require(numCaballos in 70..700){"El número de caballos debe estár entre 70 y 700 caballos"}
        require(numPuertas in 3..5){"El número de puertas debe estár entre 3 y 5"}
        this.marca = marca
        this.modelo = modelo
    }



    override fun toString(): String {
        return "MARCA: ${marca}, MODELO: ${modelo}, COLOR: ${color}, CABALLOS: ${numCaballos} HP, PUERTAS: ${numPuertas}, MATRÍCULA: ${matricula}."
    }
}
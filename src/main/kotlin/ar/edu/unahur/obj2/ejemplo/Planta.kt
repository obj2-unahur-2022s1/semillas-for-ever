package ar.edu.unahur.obj2.ejemplo

interface Planta {
    val anioObtencion: Int
    val altura: Double

    fun horasDeSolToleradas() = 7
    fun esFuerte(): Boolean
    fun espacio(): Double
    fun condicionAdicional(): Boolean
    fun daSemillas(): Boolean {
        return this.esFuerte() || this.condicionAdicional()
    }
}


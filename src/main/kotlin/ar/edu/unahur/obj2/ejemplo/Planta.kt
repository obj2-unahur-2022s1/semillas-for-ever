package ar.edu.unahur.obj2.ejemplo

interface Planta {
    val anioObtencion: Int
    val altura: Double

    fun horasDeSolToleradas() = 7
    fun esFuerte() = this.horasDeSolToleradas() >= 9
    fun espacio(): Double
    fun condicionAdicional(): Boolean
    fun daSemillas(): Boolean {
        return this.esFuerte() || this.condicionAdicional()
    }
}


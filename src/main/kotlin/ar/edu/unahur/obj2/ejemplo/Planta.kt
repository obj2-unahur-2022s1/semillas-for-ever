package ar.edu.unahur.obj2.ejemplo

interface Planta {
    val anioObtencion: Int
    val altura: Double

    fun horasDeSolToleradas() = 7
    fun daSemillas() = this.esFuerte()
    fun esFuerte() = this.horasDeSolToleradas()>9
    abstract fun espacio(): Double
    abstract fun condicionAdicional(): Boolean

}


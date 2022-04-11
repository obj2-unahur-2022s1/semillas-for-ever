package ar.edu.unahur.obj2.semillas

open class Planta(
    private val fechaDeObtencion: Int,
    private val altura: Double
) {
    open fun horasDeSolTolera(): Int {
        return 7
    }

    fun esFuerte(): Boolean {
        return horasDeSolTolera() > 9
    }

    open fun daNuevasSemillas(): Boolean {
        return true
    }

    open fun espacioQueOcupa(): Double {
        return 8.0
    }
}

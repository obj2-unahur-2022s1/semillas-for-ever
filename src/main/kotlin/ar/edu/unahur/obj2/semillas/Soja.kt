package ar.edu.unahur.obj2.semillas

open class Soja(
    private val fechaDeObtencion: Int,
    override val altura: Double
) : Planta(
    fechaDeObtencion, altura
) {
    override fun horasDeSolTolera(): Int {
        return if(altura < .5) {
            6
        } else if (altura in .5..1.0) {
            8
        } else {
            12
        }
    }

    override fun daNuevasSemillas(): Boolean {
        return fechaDeObtencion > 2007 && altura in .75..0.9
    }

    override fun esParcelaIdeal(parcela: Parcela): Boolean {
        return parcela.horasDeSolQueRecibe === horasDeSolTolera()
    }
}

package ar.edu.unahur.obj2.semillas

class SojaTransgenica(
    private val fechaDeObtencion: Int,
    override val altura: Double
) : Soja(
    fechaDeObtencion, altura
) {
    override fun daNuevasSemillas(): Boolean = false

    override fun esParcelaIdeal(parcela: Parcela): Boolean {
        return parcela.totalDePlantas() === 1
    }
}

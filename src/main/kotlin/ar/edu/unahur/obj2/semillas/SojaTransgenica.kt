package ar.edu.unahur.obj2.semillas

class SojaTransgenica(
    private val fechaDeObtencion: Int,
    private val altura: Double
) : Soja(
    fechaDeObtencion, altura
) {
    override fun daNuevasSemillas(): Boolean = false
}

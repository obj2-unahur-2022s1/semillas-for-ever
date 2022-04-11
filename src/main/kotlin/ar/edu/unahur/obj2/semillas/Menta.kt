package ar.edu.unahur.obj2.semillas

open class Menta(
    private val fechaDeObtencion: Int,
    override val altura: Double
) : Planta(
    fechaDeObtencion, altura
){
    override fun daNuevasSemillas(): Boolean {
        return altura > .4
    }

    override fun espacioQueOcupa(): Double {
        return altura.plus(1.0)
    }

    override fun esIdeal(parcela: Parcela): Boolean {
        return parcela.superficie() > 6
    }
}

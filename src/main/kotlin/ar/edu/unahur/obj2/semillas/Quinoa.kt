package ar.edu.unahur.obj2.semillas

class Quinoa(
    private val fechaDeObtencion: Int,
    override val altura: Double,
    private val espacio: Double
) : Planta(
    fechaDeObtencion, altura
){
    override fun horasDeSolTolera(): Int{
        var horasQueTolera: Int = 7
        if (espacio < .3){
            horasQueTolera = 10
        }
        return horasQueTolera
    }

    override fun daNuevasSemillas(): Boolean {
        var daSemillas = false
        if (espacio == .2 && fechaDeObtencion == 2010  || espacio == .9 && fechaDeObtencion == 2006){
            daSemillas = true
        }
        return daSemillas
    }

    override fun espacioQueOcupa(): Double {
        return espacio
    }

    override fun esIdeal(parcela: Parcela): Boolean {
        return !parcela.plantas().any { it.altura > 1.5 }
    }
}

package ar.edu.unahur.obj2.semillas

class Peperina (
    private val fechaDeObtencion: Int,
    override val altura: Double) :
    Menta(fechaDeObtencion, altura){

    override fun espacioQueOcupa(): Double {
        return super.espacioQueOcupa() * 2
    }
}

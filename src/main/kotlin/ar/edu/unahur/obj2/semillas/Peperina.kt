package ar.edu.unahur.obj2.semillas

class Peperina (
    private val fechaDeObtencion: Int,
    private val altura: Double) :
    Menta(fechaDeObtencion, altura){

    override fun espacioQueOcupa(): Double {
        return (altura + 1.0 * 2)
    }
}

package ar.edu.unahur.obj2.semillas

class Parcela(
    private val ancho: Int,
    private val largo: Int,
    val horasDeSolQueRecibe: Int,
    private val plantas: MutableList<Planta>
) {
    fun superficie(): Int = ancho * largo

    fun cantidadMaximaDePlantas(): Int {
        return if(ancho > largo) {
            superficie() / 5
        } else {
            (superficie() / 3) + largo
        }
    }

    fun tieneComplicaciones(): Boolean {
        return plantas.any { it.horasDeSolTolera() < horasDeSolQueRecibe }
    }

    fun plantar(planta: Planta): Unit {
        plantas.add(planta)
    }

    fun totalDePlantas(): Int {
        return plantas.size
    }

    fun plantas(): List<Planta> = plantas
}

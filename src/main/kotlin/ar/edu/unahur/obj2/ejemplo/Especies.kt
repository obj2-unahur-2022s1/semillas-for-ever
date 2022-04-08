package ar.edu.unahur.obj2.ejemplo

class Menta(override val anioObtencion: Int, override val altura: Double) : Planta {
    override fun espacio(): Double{
        return this.altura + 1
    }
    override fun condicionAdicional(): Boolean {
        return this.altura >0.4
    }
    override fun daSemillas(): Boolean {
        return this.esFuerte() || this.condicionAdicional()
    }
    override fun esFuerte(): Boolean {
        return this.horasDeSolToleradas() > 9
    }

}

class Soja(override val anioObtencion: Int, override val altura: Double) : Planta{
    override fun espacio(): Double {
        return this.altura/2
    }
    override fun condicionAdicional(): Boolean {
        return this.anioObtencion > 2007 && this.altura in 0.75..0.9
    }
    override fun daSemillas(): Boolean {
        return this.esFuerte() || this.condicionAdicional()
    }
    override fun horasDeSolToleradas(): Int {
        val tolerancia: Int = if (this.altura < 0.5){
            6
        }else if(this.altura in 0.5..0.9){
            8
        }else{
            12
        }
         return tolerancia
    }
    override fun esFuerte(): Boolean {
        return this.horasDeSolToleradas() > 9
    }

}
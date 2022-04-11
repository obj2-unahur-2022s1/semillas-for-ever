package ar.edu.unahur.obj2.semillas

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class ParcelaTest: DescribeSpec ({
    describe("Creación de las parcelas") {
        val parcelaChica = Parcela(
            4,
            4,
            6,
            mutableListOf(
                Soja(2021, 1.2),
                Soja(2021, .8),
                Soja(2021, .4),
                Soja(2006, .8)
            )
        )

        it("la cantidad maxima de plantas de una parcela de 4x4 deberia ser 9"){
            parcelaChica.cantidadMaximaDePlantas().shouldBe(9)
        }

        it("deberia agregar una nueva planta a la parcela"){
            val largoInicial = parcelaChica.totalDePlantas()
            parcelaChica.plantar(Soja(2006, .5))
            parcelaChica.totalDePlantas().shouldBe(largoInicial + 1)
        }
    }
})
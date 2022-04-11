package ar.edu.unahur.obj2.semillas

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.booleans.shouldBeFalse
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

        val parcelaMediana = Parcela(
            8,
            6,
            8,
            mutableListOf(
                Soja(2021, 1.2),
                Soja(2021, .8),
                Soja(2021, .6),
                Soja(2006, .8),
                Soja(2021, .7),
                Soja(2021, 1.4),
                Soja(2006, .8),
            )
        )


        it("La superficie de una parcela de 4 metros de largo y 4 metros de ancho deberia ser de 16 m2"){
            parcelaChica.superficie().shouldBe(16)
        }

        it("la cantidad maxima de plantas de una parcela de 4x4 deberia ser 9"){
            parcelaChica.cantidadMaximaDePlantas().shouldBe(9)
        }

        it("Deberia haber 4 plantas en total"){
            parcelaChica.totalDePlantas().shouldBe(4)
        }

        it("Si se agrega una planta, la cantidad total de plantas deberia ser de 5 (4+1)"){
            val largoInicial = parcelaChica.totalDePlantas()
            parcelaChica.plantar(Soja(2006, .5))
            parcelaChica.totalDePlantas().shouldBe(largoInicial + 1)
        }

        it("Una parcela chica con una Soja de 0.4 metros de altura no deberia tener problemas "){
            parcelaChica.tieneComplicaciones().shouldBeFalse()
        }

        it("La superficie de una parcela de 8 metros de largo y 6 metros de ancho deberia ser de 48 m2"){
            parcelaMediana.superficie().shouldBe(48)
        }

        it("la cantidad maxima de plantas de una parcela de 8x6 deberia ser 9"){
            parcelaMediana.cantidadMaximaDePlantas().shouldBe(9)
        }

        it("Deberia haber 7 plantas en total"){
            parcelaMediana.totalDePlantas().shouldBe(7)
        }

        it("Una parcela mediana con una Soja de 0.4 metros de altura deberia tener problemas "){
            parcelaChica.tieneComplicaciones().shouldBeFalse()
        }

    }
})

package ar.edu.unahur.obj2.semillas

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.booleans.shouldBeFalse
import io.kotest.matchers.booleans.shouldBeTrue
import io.kotest.matchers.shouldBe


class ParcelaIdealTest: DescribeSpec({
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

        val parcelaGrande = Parcela(
            10,
            8,
            8,
            mutableListOf(
                Menta(2010, .5),
                Peperina(2000, 1.0),
                Quinoa(2012, 1.3, 2.0),
                Soja(2022, .2),

                )
        )

        val menta = Menta(2018, .5)
        val peperina = Peperina(2020, 1.0)
        val quinoa = Quinoa(2000, 0.3, 1.0)
        val soja = Soja(2013, .7)
        val sojaTransgenica = SojaTransgenica(2021, 0.4)


        it("Una parcela con una superficie de 16 m2 deberia ser ideal para una menta"){
            menta.esParcelaIdeal(parcelaChica).shouldBeTrue()
        }
        it("Una parcela con una superficie de 16m2 deberia ser ideal para una peperina"){
            peperina.esParcelaIdeal(parcelaChica).shouldBeTrue()
        }

        it("Una parcela donde ninguna planta supere la altura de 1.5 metros, deberia ser ideal para una quinoa"){
            quinoa.esParcelaIdeal(parcelaChica).shouldBeTrue()
        }

        it("Una parcela donde la quinoa y la peperina superan el 1.5 metros de altura, deberia ser ideal para una quinoa"){
            quinoa.esParcelaIdeal(parcelaGrande).shouldBeTrue()
        }

        it("Una parcela con 6 horas de sol, no deberia ser ideal para una soja que tolera 8 horas"){
            soja.esParcelaIdeal(parcelaChica).shouldBeFalse()
        }

        it("Una parcela con 8 horas de sol, deberia ser ideal para una soja que tolera 8 horas"){
            soja.esParcelaIdeal(parcelaMediana).shouldBeTrue()
        }

        it("Una parcela con más de una planta, no deberia ser parcela ideal para una soja transgenica"){
            sojaTransgenica.esParcelaIdeal(parcelaGrande).shouldBeFalse()
        }
    }
})

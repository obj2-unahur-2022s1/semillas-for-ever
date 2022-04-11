package ar.edu.unahur.obj2.semillas

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.booleans.shouldBeFalse
import io.kotest.matchers.booleans.shouldBeTrue
import io.kotest.matchers.shouldBe

class PeperinaTest: DescribeSpec ({
    describe("Creación de las plantas") {
        val peperinaGrande = Menta(2021, 1.0)
        val peperinaNormal = Menta(2021, 0.5)
        val peperinaChica = Menta(2021, 0.3)

        it("una peperina de 1 metro, ocupar un espacio de 4 metros cuadrados.") {
            peperinaGrande.espacioQueOcupa().shouldBe(4)
        }

        it("una peperina de 0.3 metros, ocuparía 2.6 metros cuadrados") {
            peperinaChica.espacioQueOcupa().shouldBe(2.6)
        }

        it("una peperina de 0.5 metros, ocuparía 3.0 metros cuadrados") {
            peperinaNormal.espacioQueOcupa().shouldBe(1.5)
        }
    }
})

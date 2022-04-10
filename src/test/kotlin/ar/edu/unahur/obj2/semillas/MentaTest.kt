package ar.edu.unahur.obj2.semillas

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.booleans.shouldBeTrue
import io.kotest.matchers.booleans.shouldBeFalse
import io.kotest.matchers.shouldBe

class MentaTest: DescribeSpec ({
    describe("Creación de las plantas") {
        val mentaGrande = Menta(2021, 1.0)
        val mentaNormal = Menta(2021, 0.5)
        val mentaChica = Menta(2021, 0.3)

        it("una menta de 1 metro, debería dar semillas.") {
            mentaGrande.daNuevasSemillas().shouldBeTrue()
        }

        it("una menta de 1 metro, ocupar un espacio de 2 metros cuadrados.") {
            mentaGrande.espacioQueOcupa().shouldBe(2)
        }

        it("una menta de 0.3 metros, no debería dar semillas.") {
            mentaChica.daNuevasSemillas().shouldBeFalse()
        }

        it("una menta de 0.3 metros, ocuparía 1.3 metros cuadrados") {
            mentaChica.espacioQueOcupa().shouldBe(1.3)
        }

        it("una menta de 0.5 metros, deberia dar semillas") {
            mentaNormal.esFuerte().shouldBeTrue()
        }

        it("una menta de 0.5 metros, deberia dar semillas") {
            mentaChica.espacioQueOcupa().shouldBe(1.5)
        }
    }
})
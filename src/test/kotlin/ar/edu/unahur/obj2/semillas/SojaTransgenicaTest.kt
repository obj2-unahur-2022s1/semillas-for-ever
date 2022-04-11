package ar.edu.unahur.obj2.semillas

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.booleans.shouldBeTrue
import io.kotest.matchers.booleans.shouldBeFalse
import io.kotest.matchers.shouldBe

class SojaTransgenicaTestTest: DescribeSpec ({
    describe("Creación de las plantas") {
        val sojaGrande = SojaTransgenica(2021, 1.2)
        val sojaNormal = SojaTransgenica(2021, .8)
        val sojaChica = SojaTransgenica(2021, .4)
        val sojaVieja = SojaTransgenica(2006, .8)

        it("una soja de 1.2 metros del 2021, no deberia dar semillas.") {
            sojaGrande.daNuevasSemillas().shouldBeFalse()
        }

        it("una soja de 0.8 metros del 2021, deberia dar semillas.") {
            sojaNormal.daNuevasSemillas().shouldBeFalse()
        }

        it("una soja de 0.4 metros del 2021, no deberia dar semillas.") {
            sojaChica.daNuevasSemillas().shouldBeFalse()
        }

        it("una soja de 0.8 metros del 2006, no deberia dar semillas.") {
            sojaVieja.daNuevasSemillas().shouldBeFalse()
        }
    }
})
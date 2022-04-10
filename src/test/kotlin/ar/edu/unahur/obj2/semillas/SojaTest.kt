package ar.edu.unahur.obj2.semillas

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.booleans.shouldBeTrue
import io.kotest.matchers.booleans.shouldBeFalse
import io.kotest.matchers.shouldBe

class SojaTest: DescribeSpec ({
    describe("Creación de las plantas") {
        val sojaGrande = Soja(2021, 1.2)
        val sojaNormal = Soja(2021, .8)
        val sojaChica = Soja(2021, .4)
        val sojaVieja = Soja(2006, .8)

        it("una soja de 1.2 metros, debería tolerar 12 horas de sol.") {
            sojaGrande.horasDeSolTolera().shouldBe(12)
        }

        it("una soja de 1.2 metros del 2021, no deberia dar semillas.") {
            sojaGrande.daNuevasSemillas().shouldBeFalse()
        }

        it("una soja de 0.8 metros, debería tolerar 8 horas de sol.") {
            sojaNormal.horasDeSolTolera().shouldBe(8)
        }

        it("una soja de 0.8 metros del 2021, deberia dar semillas.") {
            sojaNormal.daNuevasSemillas().shouldBeTrue()
        }

        it("una soja de 0.4 metros, debería tolerar 6 horas de sol.") {
            sojaChica.horasDeSolTolera().shouldBe(6)
        }

        it("una soja de 0.4 metros del 2021, no deberia dar semillas.") {
            sojaChica.daNuevasSemillas().shouldBeFalse()
        }

        it("una soja de 0.8 metros del 2006, no deberia dar semillas.") {
            sojaVieja.horasDeSolTolera().shouldBe(8)
        }
        
        it("una soja de 0.8 metros del 2006, no deberia dar semillas.") {
            sojaVieja.daNuevasSemillas().shouldBeFalse()
        }
    }
})
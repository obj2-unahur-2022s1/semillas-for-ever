package ar.edu.unahur.obj2.semillas

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.booleans.shouldBeFalse
import io.kotest.matchers.booleans.shouldBeTrue
import io.kotest.matchers.shouldBe

class QuinoaTest : DescribeSpec (
    {
        describe("Creacion de la Quinoa"){

            val quinoa1 = Quinoa(2010,1.0,.2)
            val quinoa2 = Quinoa(2006,1.0,.9)
            val quinoa3 = Quinoa(2022,1.0,2.0)

            it("daNuevasSemillas"){
                quinoa1.daNuevasSemillas().shouldBeTrue()
                quinoa2.daNuevasSemillas().shouldBeTrue()
                quinoa3.daNuevasSemillas().shouldBeFalse()
            }

            it("horasDeSolTolera"){
                quinoa1.horasDeSolTolera().shouldBe(10)
                quinoa2.horasDeSolTolera().shouldBe(7)
                quinoa3.horasDeSolTolera().shouldBe(7)
            }

            it("espacioQueOcupa"){
                quinoa1.espacioQueOcupa().shouldBe(0.2)
                quinoa2.espacioQueOcupa().shouldBe(0.9)
                quinoa3.espacioQueOcupa().shouldBe(2.0)

            }

        }


    }
)
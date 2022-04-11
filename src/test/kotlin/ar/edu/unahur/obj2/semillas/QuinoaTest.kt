package ar.edu.unahur.obj2.semillas

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.booleans.shouldBeFalse
import io.kotest.matchers.booleans.shouldBeTrue
import io.kotest.matchers.shouldBe

class QuinoaTest : DescribeSpec (
    {
        describe("Creacion de las quinoas"){

            val quinoa1 = Quinoa(2010,1.0,.2)
            val quinoa2 = Quinoa(2006,1.0,.9)
            val quinoa3 = Quinoa(2022,1.0,2.0)

            it("Una quinoa de 0.2 m2 de espacio que fue obtenida en el 2010 deberia dar semillas "){
                quinoa1.daNuevasSemillas().shouldBeTrue()
            }
            it("Una quinoa de 0.9 m2 de espacio que fue obtenida en el 2006 deberia dar semillas "){
                quinoa2.daNuevasSemillas().shouldBeTrue()
            }
            it("Una quinoa de 2.0 m2 de espacio que fue obtenida en el 2022 no deberia dar semillas "){
                quinoa3.daNuevasSemillas().shouldBeFalse()
            }
            it("Una quinoa de 0.2 m2 de espacio tolera hasta 10 horas de sol"){
                quinoa1.horasDeSolTolera().shouldBe(10)
            }
            it("Una quinoa de 0.9 m2 de espacio tolera hasta 7 horas de sol"){
                quinoa2.horasDeSolTolera().shouldBe(7)
            }
            it("Una quinoa de 2.0 m2 de espacio tolera hasta 7 horas de sol"){
                quinoa3.horasDeSolTolera().shouldBe(7)
            }
        }
    }
)
package ar.edu.unahur.obj2.ejemplo

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.booleans.shouldBeFalse
import io.kotest.matchers.booleans.shouldBeTrue
import io.kotest.matchers.doubles.shouldBeBetween
import io.kotest.matchers.shouldBe

class SemillasTest : DescribeSpec ({
    // hay una clase Planta que tiene por atributos
    // anioSemilla, altura
    describe("Creación de las plantas") {
        val menta = Menta(1.0, 2021)
        val mentita = Menta(0.3, 2021)
        val soja = Soja(0.6, 2009)

        describe("los atributos funcionan") {
            it("altura  y anioSemilla") {
                menta.altura.shouldBe(1.0)
                menta.anioSemilla.shouldBe(2021)
            }
        }

        describe("verificar si da semillas") {
            it("menta chica y grande") {
                menta.daSemillas().shouldBeTrue()
                mentita.daSemillas().shouldBeFalse()
                soja.daSemillas().shouldBeFalse()
            }
        }

        it("es fuerte") {
            menta.esFuerte().shouldBeFalse()
            soja.esFuerte().shouldBeFalse()
        }

        it("espacio") {
            menta.espacio().shouldBe(2.0)
            mentita.espacio().shouldBe(1.3)
            soja.espacio().shouldBe(0.3)
        }

        val l = mutableListOf<Planta>()
        l.add(soja)
        l.add(menta)
        l.add(mentita)
        val superficie = Math.ceil(l.sumOf { p: Planta -> p.espacio() })
        superficie.shouldBe(4)
    }
})